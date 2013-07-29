package com.drjun.facebook;

import org.junit.Before;
import org.junit.Test;
import org.springframework.social.connect.support.ConnectionFactoryRegistry;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.FacebookProfile;
import org.springframework.social.facebook.api.Post;
import org.springframework.social.facebook.api.impl.FacebookTemplate;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;

import java.util.Calendar;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 29.
 * Time: 오후 7:13
 * To change this template use File | Settings | File Templates.
 */
public class FacebookAPITest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getFriendsList() {

        String accessTokenStr = "CAACEdEose0cBAAJ4cUxQZCCpGXJ0dbLq9HvqitL3ZBrHZAv2xe00PamPZBJSHlQycR1F3dwTVysci2gPQFU2vyOowgHf3GQjw6pL1B6A8YCpQ4ZAAjNlUby4iUDrc85IdF01dVc5QgoL7Ybya6H94GJQqOuP2e5NotlVA9oU2GwZDZD";
        String appId= "484532874954334";
        String appSecret = "7aaa98d386adb96e6da11b5ad839920e";

        Long st = Calendar.getInstance().getTimeInMillis();
        ConnectionFactoryRegistry registry = new ConnectionFactoryRegistry();
        registry.addConnectionFactory(new FacebookConnectionFactory(appId, appSecret));
        String accessToken = accessTokenStr; // access token received from Facebook after OAuth authorization

        Facebook facebook = new FacebookTemplate(accessToken);
        FacebookProfile profile = facebook.userOperations().getUserProfile();
        String myid = profile.getId();
        String myname = profile.getName();

        System.out.println("my id is '"+myid+"' and my name is '"+myname+".");
        System.out.println("============= timestamp : "+(Calendar.getInstance().getTimeInMillis() - st));

        st = Calendar.getInstance().getTimeInMillis();
        List<FacebookProfile> friends = facebook.friendOperations().getFriendProfiles();
        for(FacebookProfile fp : friends){
            System.out.println("Friend name => "+fp.getName());
        }

        System.out.println("============= timestamp : "+(Calendar.getInstance().getTimeInMillis() - st));
        st = Calendar.getInstance().getTimeInMillis();
        List<String> fids = facebook.friendOperations().getFriendIds();
        for(String id : fids){
            System.out.println("friend id => "+id);
        }

        System.out.println("============= timestamp : "+(Calendar.getInstance().getTimeInMillis() - st));
        st = Calendar.getInstance().getTimeInMillis();
    }

    @Test
    public void testGetFeedForPerations(){
        // 다른 사람들의 최근 Coca-Cola 게시물
        String accessTokenStr = "CAACEdEose0cBAAJ4cUxQZCCpGXJ0dbLq9HvqitL3ZBrHZAv2xe00PamPZBJSHlQycR1F3dwTVysci2gPQFU2vyOowgHf3GQjw6pL1B6A8YCpQ4ZAAjNlUby4iUDrc85IdF01dVc5QgoL7Ybya6H94GJQqOuP2e5NotlVA9oU2GwZDZD";
        String appId= "484532874954334";
        String appSecret = "7aaa98d386adb96e6da11b5ad839920e";

        Facebook facebook = new FacebookTemplate(accessTokenStr);
        List<Post> posts = facebook.feedOperations().getFeed("cocacola");
        //List<Post> posts = facebook.feedOperations().getPosts("cocacola");

        System.out.println("[count]"+posts.size());
        int count = 0;
        for(Post post: posts){
            count++;
            System.out.println("[Caption]"+post.getCaption());
            System.out.println("[Description]"+post.getDescription());
            System.out.println("[getMessage]"+post.getMessage());
        }

    }

    @Test
    public void testGetTimeForUser(){
        String accessTokenStr = "CAAAAAITEghMBAG5NpCg0h6lZAQb5T4VD7OEMiCYyBXz5GfJYaD29xZAuvGIZBVWsOwPEgDGbB3pMUPS3PisTdf2a7qMZC3uFZAan5d4r6D4Nqns1mr9GeIxWRCUbsMEL0MYrQM01CPj6YEe7iBLXSAYxbIfziCcsZD";
        String appId= "484532874954334";
        String appSecret = "7aaa98d386adb96e6da11b5ad839920e";
        String userId = "devgate";

        Facebook facebook = new FacebookTemplate(accessTokenStr);
        List<Post> posts = facebook.feedOperations().getPosts("zezebono");

        for(Post post : posts){
            System.out.println("[getMessage]"+ post.getMessage());
            System.out.println("[getUpdatedTime]"+post.getUpdatedTime()+"\n");
            //System.out.println("[getDescription]"+ post.getDescription());
        }
    }

}
