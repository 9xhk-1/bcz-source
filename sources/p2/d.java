package p2;

import com.badlogic.gdx.Input;
import java.io.DataOutputStream;
import java.net.Socket;
import q1.g;
import q1.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final int f78714c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f78715d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f78716e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f78717f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f78718g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f78719h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f78720i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static final int f78721j = 7;

    /* renamed from: k, reason: collision with root package name */
    public static final int f78722k = 8;

    /* renamed from: l, reason: collision with root package name */
    public static final int f78723l = 9;

    /* renamed from: a, reason: collision with root package name */
    public DataOutputStream f78724a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f78725b;

    public d(String str, int i11) {
        this.f78725b = false;
        try {
            Socket socket = new Socket(str, i11);
            socket.setTcpNoDelay(true);
            socket.setSoTimeout(3000);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            this.f78724a = dataOutputStream;
            dataOutputStream.writeBoolean(g.f81381d.q(Input.Peripheral.MultitouchScreen));
            this.f78725b = true;
            g.f81381d.T(this);
        } catch (Exception unused) {
            g.f81378a.f("RemoteSender", "couldn't connect to " + str + ":" + i11);
        }
    }

    @Override // q1.k
    public boolean D(float f11, float f12) {
        return false;
    }

    @Override // q1.k
    public boolean I(int i11, int i12, int i13) {
        synchronized (this) {
            try {
                if (!this.f78725b) {
                    return false;
                }
                try {
                    this.f78724a.writeInt(5);
                    this.f78724a.writeInt(i11);
                    this.f78724a.writeInt(i12);
                    this.f78724a.writeInt(i13);
                } finally {
                    synchronized (this) {
                        return false;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q1.k
    public boolean R(int i11, int i12) {
        return false;
    }

    @Override // q1.k
    public boolean X(int i11) {
        synchronized (this) {
            try {
                if (!this.f78725b) {
                    return false;
                }
                try {
                    this.f78724a.writeInt(1);
                    this.f78724a.writeInt(i11);
                } finally {
                    synchronized (this) {
                        return false;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q1.k
    public boolean Z(int i11) {
        synchronized (this) {
            try {
                if (!this.f78725b) {
                    return false;
                }
                try {
                    this.f78724a.writeInt(0);
                    this.f78724a.writeInt(i11);
                } finally {
                    synchronized (this) {
                        return false;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a() {
        boolean z11;
        synchronized (this) {
            z11 = this.f78725b;
        }
        return z11;
    }

    @Override // q1.k
    public boolean b(int i11, int i12, int i13, int i14) {
        synchronized (this) {
            try {
                if (!this.f78725b) {
                    return false;
                }
                try {
                    this.f78724a.writeInt(4);
                    this.f78724a.writeInt(i11);
                    this.f78724a.writeInt(i12);
                    this.f78724a.writeInt(i13);
                } finally {
                    synchronized (this) {
                        return false;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c() {
        synchronized (this) {
            try {
                if (this.f78725b) {
                    try {
                        this.f78724a.writeInt(6);
                        this.f78724a.writeFloat(g.f81381d.D());
                        this.f78724a.writeFloat(g.f81381d.V());
                        this.f78724a.writeFloat(g.f81381d.R());
                        this.f78724a.writeInt(7);
                        this.f78724a.writeFloat(g.f81381d.L());
                        this.f78724a.writeFloat(g.f81381d.B());
                        this.f78724a.writeFloat(g.f81381d.x());
                        this.f78724a.writeInt(8);
                        this.f78724a.writeFloat(g.f81379b.getWidth());
                        this.f78724a.writeFloat(g.f81379b.getHeight());
                        this.f78724a.writeInt(9);
                        this.f78724a.writeFloat(g.f81381d.y());
                        this.f78724a.writeFloat(g.f81381d.n());
                        this.f78724a.writeFloat(g.f81381d.r());
                    } catch (Throwable unused) {
                        this.f78724a = null;
                        this.f78725b = false;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q1.k
    public boolean i0(char c11) {
        synchronized (this) {
            try {
                if (!this.f78725b) {
                    return false;
                }
                try {
                    this.f78724a.writeInt(2);
                    this.f78724a.writeChar(c11);
                } finally {
                    synchronized (this) {
                        return false;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q1.k
    public boolean o(int i11, int i12, int i13, int i14) {
        synchronized (this) {
            try {
                if (!this.f78725b) {
                    return false;
                }
                try {
                    this.f78724a.writeInt(3);
                    this.f78724a.writeInt(i11);
                    this.f78724a.writeInt(i12);
                    this.f78724a.writeInt(i13);
                } finally {
                    synchronized (this) {
                        return false;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q1.k
    public boolean z(int i11, int i12, int i13, int i14) {
        return b(i11, i12, i13, i14);
    }
}
