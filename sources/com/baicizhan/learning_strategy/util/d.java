package com.baicizhan.learning_strategy.util;

import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public NativeObject f17827a;

    public d(NativeObject nativeObject) {
        this.f17827a = null;
        if (nativeObject == null) {
            throw new IllegalArgumentException("NativeObject is null!");
        }
        this.f17827a = nativeObject;
    }

    public Object G(String str, Object obj) {
        Scriptable scriptable = this.f17827a;
        Object obj2 = scriptable.get(str, scriptable);
        return obj2 == null ? obj : obj2;
    }

    public boolean H(String str, boolean z11) {
        Object G = G(str, null);
        if (G != null) {
            try {
                return ((Boolean) G).booleanValue();
            } catch (Exception unused) {
            }
        }
        return z11;
    }

    public int I(String str, int i11) {
        Object G = G(str, null);
        if (G != null) {
            try {
                try {
                    return ((Integer) G).intValue();
                } catch (Exception unused) {
                    return (int) ((Double) G).doubleValue();
                }
            } catch (Exception unused2) {
            }
        }
        return i11;
    }

    public long J(String str, long j11) {
        Object G = G(str, null);
        if (G != null) {
            try {
                try {
                    return ((Long) G).longValue();
                } catch (Exception unused) {
                    return (long) ((Double) G).doubleValue();
                }
            } catch (Exception unused2) {
            }
        }
        return j11;
    }

    public String K(String str, String str2) {
        Object G = G(str, null);
        if (G == null) {
            return str2;
        }
        try {
            return (String) G;
        } catch (Exception unused) {
            return str2;
        }
    }

    public boolean L(String str, boolean z11, Object... objArr) {
        try {
            return ((Boolean) R(str, Boolean.valueOf(z11), objArr)).booleanValue();
        } catch (Exception unused) {
            return z11;
        }
    }

    public double M(String str, double d11, Object... objArr) {
        try {
            return ((Double) R(str, Double.valueOf(d11), objArr)).doubleValue();
        } catch (Exception unused) {
            return d11;
        }
    }

    public int N(String str, int i11, Object... objArr) {
        try {
            return (int) M(str, i11, objArr);
        } catch (Exception unused) {
            return i11;
        }
    }

    public long O(String str, long j11, Object... objArr) {
        try {
            return (long) M(str, j11, objArr);
        } catch (Exception unused) {
            return j11;
        }
    }

    public NativeArray P(String str, NativeArray nativeArray, Object... objArr) {
        try {
            return (NativeArray) R(str, nativeArray, objArr);
        } catch (Exception unused) {
            return nativeArray;
        }
    }

    public NativeObject Q(String str, NativeObject nativeObject, Object... objArr) {
        try {
            return (NativeObject) R(str, nativeObject, objArr);
        } catch (Exception unused) {
            return nativeObject;
        }
    }

    public Object R(String str, Object obj, Object... objArr) {
        Object callMethod = ScriptableObject.callMethod(this.f17827a, str, objArr);
        return callMethod == null ? obj : callMethod;
    }

    public String S(String str, String str2, Object... objArr) {
        try {
            return (String) R(str, str2, objArr);
        } catch (Exception unused) {
            return str2;
        }
    }

    public void T(String str, Object... objArr) {
        R(str, null, objArr);
    }

    public NativeObject U() {
        return this.f17827a;
    }

    public void V(String str, Object obj) {
        Scriptable scriptable = this.f17827a;
        scriptable.put(str, scriptable, obj);
    }
}
