package org.mozilla.javascript;

import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Undefined implements Serializable {
    public static final Object instance = new Undefined();
    static final long serialVersionUID = 9195680630202616767L;

    private Undefined() {
    }

    public Object readResolve() {
        return instance;
    }
}
