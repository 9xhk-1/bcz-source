package ik;

import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kk.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c<T> implements h<T> {

    /* renamed from: c, reason: collision with root package name */
    public final Collection<? extends h<T>> f60687c;

    @SafeVarargs
    public c(@NonNull h<T>... hVarArr) {
        if (hVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f60687c = Arrays.asList(hVarArr);
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        Iterator<? extends h<T>> it = this.f60687c.iterator();
        while (it.hasNext()) {
            it.next().a(messageDigest);
        }
    }

    @Override // ik.h
    @NonNull
    public u<T> b(@NonNull Context context, @NonNull u<T> uVar, int i11, int i12) {
        Iterator<? extends h<T>> it = this.f60687c.iterator();
        u<T> uVar2 = uVar;
        while (it.hasNext()) {
            u<T> b11 = it.next().b(context, uVar2, i11, i12);
            if (uVar2 != null && !uVar2.equals(uVar) && !uVar2.equals(b11)) {
                uVar2.recycle();
            }
            uVar2 = b11;
        }
        return uVar2;
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f60687c.equals(((c) obj).f60687c);
        }
        return false;
    }

    @Override // ik.b
    public int hashCode() {
        return this.f60687c.hashCode();
    }

    public c(@NonNull Collection<? extends h<T>> collection) {
        if (!collection.isEmpty()) {
            this.f60687c = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
