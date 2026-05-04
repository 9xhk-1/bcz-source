package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.Texture;
import com.baicizhan.main.activity.GuideActivity;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class PixmapPackerIO {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ImageFormat {
        CIM(".cim"),
        PNG(GuideActivity.f17949k);

        private final String extension;

        ImageFormat(String str) {
            this.extension = str;
        }

        public String getExtension() {
            return this.extension;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11987a;

        static {
            int[] iArr = new int[ImageFormat.values().length];
            f11987a = iArr;
            try {
                iArr[ImageFormat.CIM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11987a[ImageFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public ImageFormat f11988a = ImageFormat.PNG;

        /* renamed from: b, reason: collision with root package name */
        public Texture.TextureFilter f11989b;

        /* renamed from: c, reason: collision with root package name */
        public Texture.TextureFilter f11990c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f11991d;

        public b() {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
            this.f11989b = textureFilter;
            this.f11990c = textureFilter;
        }
    }

    public void a(v1.a aVar, PixmapPacker pixmapPacker) throws IOException {
        b(aVar, pixmapPacker, new b());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(v1.a r20, com.badlogic.gdx.graphics.g2d.PixmapPacker r21, com.badlogic.gdx.graphics.g2d.PixmapPackerIO.b r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.graphics.g2d.PixmapPackerIO.b(v1.a, com.badlogic.gdx.graphics.g2d.PixmapPacker, com.badlogic.gdx.graphics.g2d.PixmapPackerIO$b):void");
    }
}
