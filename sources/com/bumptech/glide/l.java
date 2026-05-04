package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.l;
import dl.j;
import fl.m;
import fl.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public dl.g<? super TranscodeType> f28711a = dl.e.c();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    @NonNull
    public final CHILD b() {
        return f(dl.e.c());
    }

    public final dl.g<? super TranscodeType> c() {
        return this.f28711a;
    }

    @NonNull
    public final CHILD e(int i11) {
        return f(new dl.h(i11));
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return o.e(this.f28711a, ((l) obj).f28711a);
        }
        return false;
    }

    @NonNull
    public final CHILD f(@NonNull dl.g<? super TranscodeType> gVar) {
        this.f28711a = (dl.g) m.e(gVar);
        return d();
    }

    @NonNull
    public final CHILD g(@NonNull j.a aVar) {
        return f(new dl.i(aVar));
    }

    public int hashCode() {
        dl.g<? super TranscodeType> gVar = this.f28711a;
        if (gVar != null) {
            return gVar.hashCode();
        }
        return 0;
    }

    public final CHILD d() {
        return this;
    }
}
