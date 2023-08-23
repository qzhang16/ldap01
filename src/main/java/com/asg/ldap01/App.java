package com.asg.ldap01;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println("Hello World!");
        // Hashtable<String, Object> env = new Hashtable<>();
        // env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        // env.put(Context.PROVIDER_URL, "ldap://127.0.0.1:10389/ou=people,o=sevenSeas,dc=example,dc=com");
        // env.put(Context.SECURITY_PRINCIPAL, "uid=admin,ou=system");
        // env.put(Context.SECURITY_CREDENTIALS, "secret");

        Context ctx = new InitialContext();
        // DirContext dctx = new InitialDirContext(env);
        // LdapContext a = (LdapContext) ctx.lookup("cn=John Hallett");
        // a.list("").toString();
        // System.out.println(ctx.list("").toString());
        NamingEnumeration<NameClassPair> n = ctx.list("");
        while (n.hasMore()) {
            //    System.out.println( n.next().getNameInNamespace());
            System.out.println(n.next().getName());
        }

    }
}
