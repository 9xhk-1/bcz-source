package com.zx.a.I8b7;

import com.zx.module.base.Listener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class y0 implements Listener {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Set<z0>> f46754a = new HashMap();

    public synchronized void a(String str, z0 z0Var) {
        try {
            if (!this.f46754a.containsKey(str)) {
                this.f46754a.put(str, new HashSet());
            }
            this.f46754a.get(str).add(z0Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.zx.module.base.Listener
    public void onMessage(String str, String str2) {
        Set<z0> set = this.f46754a.get(str);
        if (set != null) {
            Iterator<z0> it = set.iterator();
            while (it.hasNext()) {
                it.next().a(str2);
            }
        }
    }
}
