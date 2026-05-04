package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.o0;
import e1.c;
import j1.f;
import l50.b;
import y0.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class MergePaths implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10010a;

    /* renamed from: b, reason: collision with root package name */
    public final MergePathsMode f10011b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10012c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i11) {
            return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z11) {
        this.f10010a = str;
        this.f10011b = mergePathsMode;
        this.f10012c = z11;
    }

    @Override // e1.c
    @Nullable
    public y0.c a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar) {
        if (o0Var.H()) {
            return new l(this);
        }
        f.e("Animation contains merge paths but they are disabled.");
        return null;
    }

    public MergePathsMode b() {
        return this.f10011b;
    }

    public String c() {
        return this.f10010a;
    }

    public boolean d() {
        return this.f10012c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f10011b + b.f69928j;
    }
}
