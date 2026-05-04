package com.google.accompanist.pager;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.jvm.internal.Lambda;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.a<f> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30406a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11) {
            super(0);
            this.f30406a = i11;
        }

        @Override // x00.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke() {
            return new f(this.f30406a);
        }
    }

    @Composable
    @b
    @k
    public static final f a(@IntRange(from = 0) int i11, @l Composer composer, int i12, int i13) {
        composer.startReplaceableGroup(-1078956622);
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        f fVar = (f) RememberSaveableKt.m2066rememberSaveable(new Object[0], (Saver) f.f30378g.a(), (String) null, (x00.a) new a(i11), composer, 72, 4);
        composer.endReplaceableGroup();
        return fVar;
    }
}
