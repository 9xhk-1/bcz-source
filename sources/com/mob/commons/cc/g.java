package com.mob.commons.cc;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public a f40231a;

    public interface a {
        Object a(String str, ArrayList<Object> arrayList);
    }

    public g(a aVar) {
        this.f40231a = aVar;
    }

    public Object a(String str, ArrayList<Object> arrayList) {
        a aVar = this.f40231a;
        if (aVar == null) {
            return null;
        }
        return aVar.a(str, arrayList);
    }
}
