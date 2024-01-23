package com.gorest.constants;/**
 * @author VibrantSoul
 */

/**
 *@author VibrantSoul
 */
public class EndPoints {
    /**
     * These are Endpoints of Users api
     */
    public static final String GET_ALL_USERS = "/users";
    public static final String GET_SINGLE_USER_BY_Id = "/users/{userId}";
    public static final String UPDATE_USER_BY_Id = "/users/{userId}";
    public static final String DELETE_USER_BY_ID = "/users/{userId}";

    /**
     * These are  Endpoints for  Posts api
     */

    public static final String GET_ALL_POSTS = "/posts";
    public static final String GET_SINGLE_POST_BY_Id = "/posts/{postId}";
    public static final String UPDATE_POST_BY_Id = "/posts/{postId}";
    public static final String DELETE_POST_BY_ID = "/posts/{postId}";
}
