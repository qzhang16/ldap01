package com.asg.ldap01;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.LdapContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        // Hashtable<String, Object> env = new Hashtable<>();
        // env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        // env.put(Context.PROVIDER_URL,
        // "ldap://127.0.0.1:10389/ou=people,o=sevenSeas,dc=example,dc=com");
        // env.put(Context.SECURITY_PRINCIPAL, "uid=admin,ou=system");
        // env.put(Context.SECURITY_CREDENTIALS, "secret");

        Context ctx0 = new InitialContext();
        LdapContext ctx = (LdapContext) ctx0.lookup("");

        String filter = "(&(cn=John*)(mail=*))";
        SearchControls sctls = new SearchControls();
        NamingEnumeration<SearchResult> answer = ctx.search("ou=people", filter, sctls);
        while (answer.hasMore()) {
            System.out.println(answer.next().getName());
        }
        // Attributes atrs = new BasicAttributes(true);
        // Attribute atr = new BasicAttribute("objectclass");
        // atr.add("top");
        // atr.add("organizationalUnit");
        // atrs.put(atr);

        // LdapContext newOu = (LdapContext) ctx.createSubcontext("ou=quality", atrs);
        // System.out.println(newOu.getNameInNamespace());

        // Attributes answer = ctx.getAttributes("ou=quality", new String[]{"objectclass"});

        // for (NamingEnumeration<? extends Attribute> ae = answer.getAll(); ae.hasMore();) {
        //     Attribute attr = (Attribute) ae.next();
        //     System.out.println("attribute: " + attr.getID());
        //     /* Print each value */
        //     for (NamingEnumeration<?> e = attr.getAll(); e.hasMore();)
        //         System.out.println("value: " + e.next());
        // }

        // LdapContext ctx = (LdapContext) InitialContext.doLookup("ou=people");
        // DirContext dctx = new InitialDirContext(env);
        // LdapContext a = (LdapContext) ctx.lookup("cn=John Hallett");
        // a.list("").toString();
        // System.out.println(ctx.list("").toString());
        // NamingEnumeration<NameClassPair> n = ctx.list("");
        // while (n.hasMore()) {
        // // System.out.println( n.next().getNameInNamespace());
        // System.out.println(n.next());
        // }

    }
}
