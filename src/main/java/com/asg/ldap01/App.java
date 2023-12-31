package com.asg.ldap01;

import java.io.Serializable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.directory.DirContext;

/**
 * Hello world!
 *
 */
public class App  {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        // Hashtable<String, Object> env = new Hashtable<>();
        // env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        // env.put(Context.PROVIDER_URL,
        // "ldap://127.0.0.1:10389/ou=people,o=sevenSeas,dc=example,dc=com");
        // env.put(Context.SECURITY_PRINCIPAL, "uid=admin,ou=system");
        // env.put(Context.SECURITY_CREDENTIALS, "secret");

        Context ctx = new InitialContext();
        DirContext abc = (DirContext) ctx.lookup("cn=abc,ou=people");
        System.out.println(abc.getAttributes("").get("mail").get());

        // Abcs abc01 = new Abcs();
        // abc01.setId(1);
        // abc01.setName("Bob");

        // abc.bind("cn=neighbor", abc01);
        // abc.unbind("cn=neighbor");

        // Abcs a = (Abcs) abc.lookup("cn=neighbor");
        // System.out.println("id: " + a.getId());
        // System.out.println("name: " + a.getName());

        // EventContext ctx = (EventContext) ctx0.lookup("ou=people,o=sevenSeas,dc=example,dc=com");

        // NamingListener listener = new App();
        // ctx.addNamingListener("", EventContext.SUBTREE_SCOPE, listener);
        // latch.await();
        // Attributes answer = ctx.getAttributes("", new String[] { "supportedSASLMechanisms" });
        // NamingEnumeration<? extends Attribute> as = answer.getAll();

        // while (as.hasMore()) {
        //     Attribute a = as.next();
        //     NamingEnumeration<?> vs = a.getAll();
        //     while (vs.hasMore()) {
        //         System.out.println(vs.next());
        //     }

        // }

        // LdapContext ctx = (LdapContext) ctx0.lookup("");

        // String filter = "(&(cn=John*)(mail=*))";
        // SearchControls sctls = new SearchControls();
        // NamingEnumeration<SearchResult> answer = ctx.search("ou=people", filter,
        // sctls);
        // while (answer.hasMore()) {
        // System.out.println(answer.next().getName());
        // }
        // Attributes atrs = new BasicAttributes(true);
        // Attribute atr = new BasicAttribute("objectclass");
        // atr.add("top");
        // atr.add("organizationalUnit");
        // atrs.put(atr);

        // LdapContext newOu = (LdapContext) ctx.createSubcontext("ou=quality", atrs);
        // System.out.println(newOu.getNameInNamespace());

        // Attributes answer = ctx.getAttributes("ou=quality", new
        // String[]{"objectclass"});

        // for (NamingEnumeration<? extends Attribute> ae = answer.getAll();
        // ae.hasMore();) {
        // Attribute attr = (Attribute) ae.next();
        // System.out.println("attribute: " + attr.getID());
        // /* Print each value */
        // for (NamingEnumeration<?> e = attr.getAll(); e.hasMore();)
        // System.out.println("value: " + e.next());
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

    // @Override
    // public void objectAdded(NamingEvent evt) {

    //     System.out.println("object added:" + evt.getChangeInfo());
    //     latch.countDown();
    // }

    // @Override
    // public void objectRemoved(NamingEvent evt) {
    //     System.out.println("object removed:" + evt.getChangeInfo());
    //     latch.countDown();
    // }

    // @Override
    // public void objectRenamed(NamingEvent evt) {
    //     System.out.println("object removed:" + evt.getChangeInfo());
    //     latch.countDown();
    // }

    // @Override
    // public void namingExceptionThrown(NamingExceptionEvent evt) {
    //     evt.getException().printStackTrace();
    // }
}

class Abcs implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    

}
