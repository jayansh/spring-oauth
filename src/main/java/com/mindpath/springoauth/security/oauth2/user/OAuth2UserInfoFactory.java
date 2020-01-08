package com.mindpath.springoauth.security.oauth2.user;

import java.util.Map;

import com.mindpath.springoauth.exception.OAuth2AuthenticationProcessingException;
import com.mindpath.springoauth.model.AuthProvider;

public class OAuth2UserInfoFactory {

    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if(registrationId.equalsIgnoreCase(AuthProvider.google.toString())) {
            return new GoogleOAuth2UserInfo(attributes);
        } else if(registrationId.equalsIgnoreCase(AuthProvider.pingFederate.toString())) {
            return new PingFederateOAuth2UserInfo(attributes);
        //} else if registrationId equals AuthProvider.facebook return FacebookOAuth2UserInfo
        //} else if registrationId equals AuthProvider.github return LinkedinOAuth2UserInfo
    	//} else if registrationId equals AuthProvider.github return GithubOAuth2UserInfo
        } else {
            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }
}