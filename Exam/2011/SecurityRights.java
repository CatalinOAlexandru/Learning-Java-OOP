public class SecurityRights
{
private boolean right;
private boolean canreadSecret;
String SECRET="the secret is 42";


public SecurityRights(boolean r)
{
 right =r;
 if (r) canreadSecret=true; else canreadSecret=false;
}

boolean getRight(){
 return right;
}

boolean canReadSecret(){
 return canreadSecret;
}

String getSecret(){
 if (canreadSecret) return SECRET; else return "access denied";
}

}