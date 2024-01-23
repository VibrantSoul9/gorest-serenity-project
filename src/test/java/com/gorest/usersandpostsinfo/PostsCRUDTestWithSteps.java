package com.gorest.usersandpostsinfo;/**
 * @author VibrantSoul
 */

import com.gorest.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import org.junit.jupiter.api.Test;

/**
 *@author VibrantSoul
 */
public class PostsCRUDTestWithSteps extends TestBase {
    static int user_id = 6045189;
    static String title = "Apparatus demoror arcus cenaculum textor usque ara acerbitas.";
    static String body = "Cervus illo volubilis. Enim patior eos. Abeo adfectus carmen.Corroboro abbas facilis. Creptio atrocitas vinculum. Utor bellum temperantia. Supra tremo tripudio. Quo advenio abbas. Tepidus sit aurum. Damno conqueror quae. Est illum crinis.";

    static int postId;

    @Steps
    PostsSteps steps;

    @Title("This will create new post")
    @Test
    public void test001(){

        ValidatableResponse response = steps.createPost(user_id, title, body).statusCode(201);
        postId = response.extract().path("id");
    }

    @Title("Verify the post added to the application")
    @Test
    public void test002(){

        String postList = steps.getPostByIdAndVerifyTitle(postId);

        Assert.assertEquals(title, postList);
    }

    @Title("Update and verify post information")
    @Test
    public void test003(){
        user_id = 6045190;
        title = title + "_updated";
        body = body + "_updated";

        steps.updatePost(postId,user_id, title, body).statusCode(200);

        String postList = steps.getPostByIdAndVerifyTitle(postId);

        Assert.assertEquals(title, postList);
    }

    @Title("Delete the post and verify if the post deleted")
    @Test
    public void test004(){

        steps.deletePost(postId).statusCode(204);
        steps.verifyingPostDeletedById(postId).statusCode(404);
    }

}
