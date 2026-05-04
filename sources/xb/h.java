package xb;

import android.os.Environment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h implements m {

    /* renamed from: o, reason: collision with root package name */
    public static h f97947o;

    /* renamed from: a, reason: collision with root package name */
    public final String f97948a = "dev_mount";

    /* renamed from: b, reason: collision with root package name */
    public final String f97949b = "<label>";

    /* renamed from: c, reason: collision with root package name */
    public final String f97950c = "<mount_point>";

    /* renamed from: d, reason: collision with root package name */
    public final String f97951d = "<part>";

    /* renamed from: e, reason: collision with root package name */
    public final String f97952e = "<sysfs_path1...>";

    /* renamed from: f, reason: collision with root package name */
    public final int f97953f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f97954g = 2;

    /* renamed from: h, reason: collision with root package name */
    public final int f97955h = 3;

    /* renamed from: i, reason: collision with root package name */
    public final int f97956i = 4;

    /* renamed from: j, reason: collision with root package name */
    public final int f97957j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final int f97958k = 1;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<String> f97959l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    public a f97960m;

    /* renamed from: n, reason: collision with root package name */
    public final File f97961n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public String f97962a;

        /* renamed from: b, reason: collision with root package name */
        public String f97963b;

        /* renamed from: c, reason: collision with root package name */
        public String f97964c;

        /* renamed from: d, reason: collision with root package name */
        public String f97965d;

        public a() {
        }

        public String e() {
            return this.f97962a;
        }

        public String f() {
            return this.f97963b;
        }

        public String g() {
            return this.f97964c;
        }

        public String h() {
            return this.f97965d;
        }

        public final void i(String label) {
            this.f97962a = label;
        }

        public final void j(String mount_point) {
            this.f97963b = mount_point;
        }

        public final void k(String path) {
            this.f97964c = path;
        }

        public final void l(String sysfs_path) {
            this.f97965d = sysfs_path;
        }
    }

    public h() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getRootDirectory().getAbsoluteFile());
        String str = File.separator;
        sb2.append(str);
        sb2.append("etc");
        sb2.append(str);
        sb2.append("vold.fstab");
        this.f97961n = new File(sb2.toString());
    }

    public static h d() {
        if (f97947o == null) {
            f97947o = new h();
        }
        return f97947o;
    }

    @Override // xb.m
    public a a() {
        return c(0);
    }

    @Override // xb.m
    public a b() {
        return c(1);
    }

    public final a c(final int device) {
        if (this.f97960m == null) {
            this.f97960m = new a();
        }
        try {
            e();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        if (device >= this.f97959l.size()) {
            return null;
        }
        String[] split = this.f97959l.get(device).split(" ");
        this.f97960m.i(split[1]);
        this.f97960m.j(split[3]);
        this.f97960m.k(split[2]);
        this.f97960m.l(split[4]);
        return this.f97960m;
    }

    public final void e() throws IOException {
        this.f97959l.clear();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f97961n));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                this.f97959l.trimToSize();
                return;
            } else if (readLine.startsWith("dev_mount")) {
                this.f97959l.add(readLine);
            }
        }
    }
}
