Documentations:
https://developers.google.com/identity/protocols/OAuth2

Prerequisites:
- Google Account
- Curl

...

Registration:

https://console.developers.google.com

- Enable APIs
- Create ClientID:
	Register redirectURI=http://localhost:8080/login/oauth2/code/google
	URLENCODE(redirectURI)=http%3A%2F%2Flocalhost%3A8080%2Flogin%2Foauth2%2Fcode%2Fgoogle
	clientId=381800913417-3olhtfl754lj0m4f0fhatnlb6tk8fsvc.apps.googleusercontent.com
	clientSecret=CzLizG2WQQ3mqyqDUIMI5_Xa

...

Authorization Endpoint(Browser):

https://accounts.google.com/o/oauth2/auth?redirect_uri=URLENCODE(redirectURI)&response_type=code&client_id=clientId&scope=email&approval_prompt=force

...
Token Endpoint:
curl -X POST -H "content-type:application/x-www-form-urlencoded" -d "grant_type=authorization_code&code&rediect_uri=URLENCODE(redirectURI)&clientID&client_secret=clientSecret" "https://accounts.google.com/o/oauth2/token"


---
Resource Access:

curl -H "Authorization: Bearer accessToken"
