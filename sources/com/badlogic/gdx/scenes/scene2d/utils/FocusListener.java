package com.badlogic.gdx.scenes.scene2d.utils;

import a3.d0;
import x2.b;
import x2.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class FocusListener implements c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FocusEvent extends b {

        /* renamed from: i, reason: collision with root package name */
        public boolean f13145i;

        /* renamed from: j, reason: collision with root package name */
        public Type f13146j;

        /* renamed from: k, reason: collision with root package name */
        public com.badlogic.gdx.scenes.scene2d.a f13147k;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum Type {
            keyboard,
            scroll
        }

        @d0
        public com.badlogic.gdx.scenes.scene2d.a q() {
            return this.f13147k;
        }

        public Type r() {
            return this.f13146j;
        }

        @Override // x2.b, a3.j0.a
        public void reset() {
            super.reset();
            this.f13147k = null;
        }

        public boolean s() {
            return this.f13145i;
        }

        public void t(boolean z11) {
            this.f13145i = z11;
        }

        public void u(@d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            this.f13147k = aVar;
        }

        public void v(Type type) {
            this.f13146j = type;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13148a;

        static {
            int[] iArr = new int[FocusEvent.Type.values().length];
            f13148a = iArr;
            try {
                iArr[FocusEvent.Type.keyboard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13148a[FocusEvent.Type.scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // x2.c
    public boolean a(b bVar) {
        if (!(bVar instanceof FocusEvent)) {
            return false;
        }
        FocusEvent focusEvent = (FocusEvent) bVar;
        int i11 = a.f13148a[focusEvent.r().ordinal()];
        if (i11 == 1) {
            b(focusEvent, bVar.e(), focusEvent.s());
        } else if (i11 == 2) {
            c(focusEvent, bVar.e(), focusEvent.s());
        }
        return false;
    }

    public void b(FocusEvent focusEvent, com.badlogic.gdx.scenes.scene2d.a aVar, boolean z11) {
    }

    public void c(FocusEvent focusEvent, com.badlogic.gdx.scenes.scene2d.a aVar, boolean z11) {
    }
}
