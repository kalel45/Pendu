import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;


import java.io.IOException;

//import models.Dictionnaire;
//import models.Mot;

import java.lang.Runtime;

/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    void assert_Dictionnaire_choisirMot() throws IOException {
        assertFalse(new Dictionnaire().choisirMot("public/document/listmot.txt").isEmpty());
    }

    /**
    Test Si la foction choisirMot retourne quelque chose de pas vide (Si elle n'est pas vide, c'est qu'elle a selectionné un mot du fichier listMot.txt)
    **/
    @Test
    public void choisirMot() {
        try{
            assert_Dictionnaire_choisirMot();
        }
        catch(IOException exc)
        {
            System.out.println("Erreur...");
        }
    }

  
}
