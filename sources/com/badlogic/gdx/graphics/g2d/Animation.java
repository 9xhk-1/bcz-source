package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.math.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Animation<T> {

    /* renamed from: a, reason: collision with root package name */
    public T[] f11863a;

    /* renamed from: b, reason: collision with root package name */
    public float f11864b;

    /* renamed from: c, reason: collision with root package name */
    public float f11865c;

    /* renamed from: d, reason: collision with root package name */
    public int f11866d;

    /* renamed from: e, reason: collision with root package name */
    public float f11867e;

    /* renamed from: f, reason: collision with root package name */
    public PlayMode f11868f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum PlayMode {
        NORMAL,
        REVERSED,
        LOOP,
        LOOP_REVERSED,
        LOOP_PINGPONG,
        LOOP_RANDOM
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11869a;

        static {
            int[] iArr = new int[PlayMode.values().length];
            f11869a = iArr;
            try {
                iArr[PlayMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11869a[PlayMode.LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11869a[PlayMode.LOOP_PINGPONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11869a[PlayMode.LOOP_RANDOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11869a[PlayMode.REVERSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11869a[PlayMode.LOOP_REVERSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Animation(float f11, com.badlogic.gdx.utils.a<? extends T> aVar) {
        this.f11868f = PlayMode.NORMAL;
        this.f11864b = f11;
        Object[] objArr = (Object[]) g3.b.c(aVar.f13178a.getClass().getComponentType(), aVar.f13179b);
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = aVar.get(i12);
        }
        j(objArr);
    }

    public float a() {
        return this.f11865c;
    }

    public float b() {
        return this.f11864b;
    }

    public T c(float f11) {
        return this.f11863a[e(f11)];
    }

    public T d(float f11, boolean z11) {
        PlayMode playMode;
        PlayMode playMode2;
        PlayMode playMode3 = this.f11868f;
        if (z11 && (playMode3 == (playMode2 = PlayMode.NORMAL) || playMode3 == PlayMode.REVERSED)) {
            if (playMode3 == playMode2) {
                this.f11868f = PlayMode.LOOP;
            } else {
                this.f11868f = PlayMode.LOOP_REVERSED;
            }
        } else if (!z11 && playMode3 != PlayMode.NORMAL && playMode3 != (playMode = PlayMode.REVERSED)) {
            if (playMode3 == PlayMode.LOOP_REVERSED) {
                this.f11868f = playMode;
            } else {
                this.f11868f = PlayMode.LOOP;
            }
        }
        T c11 = c(f11);
        this.f11868f = playMode3;
        return c11;
    }

    public int e(float f11) {
        if (this.f11863a.length == 1) {
            return 0;
        }
        int i11 = (int) (f11 / this.f11864b);
        switch (a.f11869a[this.f11868f.ordinal()]) {
            case 1:
                i11 = Math.min(this.f11863a.length - 1, i11);
                break;
            case 2:
                i11 %= this.f11863a.length;
                break;
            case 3:
                T[] tArr = this.f11863a;
                i11 %= (tArr.length * 2) - 2;
                if (i11 >= tArr.length) {
                    i11 = (tArr.length - 2) - (i11 - tArr.length);
                    break;
                }
                break;
            case 4:
                if (((int) (this.f11867e / this.f11864b)) == i11) {
                    i11 = this.f11866d;
                    break;
                } else {
                    i11 = n.M(this.f11863a.length - 1);
                    break;
                }
            case 5:
                i11 = Math.max((this.f11863a.length - i11) - 1, 0);
                break;
            case 6:
                T[] tArr2 = this.f11863a;
                i11 = (tArr2.length - (i11 % tArr2.length)) - 1;
                break;
        }
        this.f11866d = i11;
        this.f11867e = f11;
        return i11;
    }

    public T[] f() {
        return this.f11863a;
    }

    public PlayMode g() {
        return this.f11868f;
    }

    public boolean h(float f11) {
        return this.f11863a.length - 1 < ((int) (f11 / this.f11864b));
    }

    public void i(float f11) {
        this.f11864b = f11;
        this.f11865c = this.f11863a.length * f11;
    }

    public void j(T... tArr) {
        this.f11863a = tArr;
        this.f11865c = tArr.length * this.f11864b;
    }

    public void k(PlayMode playMode) {
        this.f11868f = playMode;
    }

    public Animation(float f11, com.badlogic.gdx.utils.a<? extends T> aVar, PlayMode playMode) {
        this(f11, aVar);
        k(playMode);
    }

    public Animation(float f11, T... tArr) {
        this.f11868f = PlayMode.NORMAL;
        this.f11864b = f11;
        j(tArr);
    }
}
