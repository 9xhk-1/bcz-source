package b2;

import com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial;
import com.badlogic.gdx.utils.a;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import d2.i;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<ModelMaterial> f5670a = new com.badlogic.gdx.utils.a<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f5671a = "default";

        /* renamed from: b, reason: collision with root package name */
        public com.badlogic.gdx.graphics.b f5672b;

        /* renamed from: c, reason: collision with root package name */
        public com.badlogic.gdx.graphics.b f5673c;

        /* renamed from: d, reason: collision with root package name */
        public com.badlogic.gdx.graphics.b f5674d;

        /* renamed from: e, reason: collision with root package name */
        public float f5675e;

        /* renamed from: f, reason: collision with root package name */
        public float f5676f;

        /* renamed from: g, reason: collision with root package name */
        public String f5677g;

        /* renamed from: h, reason: collision with root package name */
        public String f5678h;

        /* renamed from: i, reason: collision with root package name */
        public String f5679i;

        /* renamed from: j, reason: collision with root package name */
        public String f5680j;

        /* renamed from: k, reason: collision with root package name */
        public String f5681k;

        public a() {
            c();
        }

        public final void a(ModelMaterial modelMaterial, String str, int i11) {
            if (str != null) {
                i iVar = new i();
                iVar.f47061e = i11;
                iVar.f47058b = str;
                if (modelMaterial.f12153j == null) {
                    modelMaterial.f12153j = new com.badlogic.gdx.utils.a<>(1);
                }
                modelMaterial.f12153j.a(iVar);
            }
        }

        public ModelMaterial b() {
            ModelMaterial modelMaterial = new ModelMaterial();
            modelMaterial.f12144a = this.f5671a;
            modelMaterial.f12146c = this.f5672b == null ? null : new com.badlogic.gdx.graphics.b(this.f5672b);
            modelMaterial.f12147d = new com.badlogic.gdx.graphics.b(this.f5673c);
            modelMaterial.f12148e = new com.badlogic.gdx.graphics.b(this.f5674d);
            modelMaterial.f12152i = this.f5675e;
            modelMaterial.f12151h = this.f5676f;
            a(modelMaterial, this.f5677g, 9);
            a(modelMaterial, this.f5678h, 4);
            a(modelMaterial, this.f5679i, 2);
            a(modelMaterial, this.f5681k, 5);
            a(modelMaterial, this.f5680j, 6);
            return modelMaterial;
        }

        public void c() {
            this.f5672b = null;
            com.badlogic.gdx.graphics.b bVar = com.badlogic.gdx.graphics.b.f11522e;
            this.f5673c = bVar;
            this.f5674d = bVar;
            this.f5675e = 1.0f;
            this.f5676f = 0.0f;
            this.f5677g = null;
            this.f5678h = null;
            this.f5679i = null;
            this.f5680j = null;
            this.f5681k = null;
        }
    }

    public ModelMaterial a(String str) {
        a.b<ModelMaterial> it = this.f5670a.iterator();
        while (it.hasNext()) {
            ModelMaterial next = it.next();
            if (next.f12144a.equals(str)) {
                return next;
            }
        }
        ModelMaterial modelMaterial = new ModelMaterial();
        modelMaterial.f12144a = str;
        modelMaterial.f12147d = new com.badlogic.gdx.graphics.b(com.badlogic.gdx.graphics.b.f11522e);
        this.f5670a.a(modelMaterial);
        return modelMaterial;
    }

    public void b(v1.a aVar) {
        a aVar2 = new a();
        if (aVar == null || !aVar.l()) {
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(aVar.F()), 4096);
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    this.f5670a.a(aVar2.b());
                    return;
                }
                if (readLine.length() > 0 && readLine.charAt(0) == '\t') {
                    readLine = readLine.substring(1).trim();
                }
                String[] split = readLine.split("\\s+");
                if (split[0].length() != 0 && split[0].charAt(0) != '#') {
                    String lowerCase = split[0].toLowerCase();
                    if (lowerCase.equals("newmtl")) {
                        this.f5670a.a(aVar2.b());
                        if (split.length > 1) {
                            String str = split[1];
                            aVar2.f5671a = str;
                            aVar2.f5671a = str.replace('.', '_');
                        } else {
                            aVar2.f5671a = "default";
                        }
                        aVar2.c();
                    } else if (lowerCase.equals("ka")) {
                        aVar2.f5672b = c(split);
                    } else if (lowerCase.equals("kd")) {
                        aVar2.f5673c = c(split);
                    } else if (lowerCase.equals("ks")) {
                        aVar2.f5674d = c(split);
                    } else {
                        if (!lowerCase.equals("tr") && !lowerCase.equals("d")) {
                            if (lowerCase.equals(NotificationStyle.NOTIFICATION_STYLE)) {
                                aVar2.f5676f = Float.parseFloat(split[1]);
                            } else if (lowerCase.equals("map_d")) {
                                aVar2.f5677g = aVar.B().a(split[1]).C();
                            } else if (lowerCase.equals("map_ka")) {
                                aVar2.f5678h = aVar.B().a(split[1]).C();
                            } else if (lowerCase.equals("map_kd")) {
                                aVar2.f5679i = aVar.B().a(split[1]).C();
                            } else if (lowerCase.equals("map_ks")) {
                                aVar2.f5681k = aVar.B().a(split[1]).C();
                            } else if (lowerCase.equals("map_ns")) {
                                aVar2.f5680j = aVar.B().a(split[1]).C();
                            }
                        }
                        aVar2.f5675e = Float.parseFloat(split[1]);
                    }
                }
            } catch (IOException unused) {
                return;
            }
        }
    }

    public final com.badlogic.gdx.graphics.b c(String[] strArr) {
        return new com.badlogic.gdx.graphics.b(Float.parseFloat(strArr[1]), Float.parseFloat(strArr[2]), Float.parseFloat(strArr[3]), strArr.length > 4 ? Float.parseFloat(strArr[4]) : 1.0f);
    }
}
