package controllers;
import models.*;
import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import play.data.validation.Constraints.*;
import views.html.*;

public class Application extends Controller {

	final static Mot mot = new Mot ("public/document/listmot.txt");
    final static Pendu pendu = new Pendu (5);

    public static class Lettre {
        @Required public char lettre;
        
    } 



    public static Result index() {
    	Form<Lettre> form = form(Lettre.class).bindFromRequest();
    	Lettre data = form.get();
        return ok(index.render(form, data.lettre,pendu, mot));
            

    }



   
}
