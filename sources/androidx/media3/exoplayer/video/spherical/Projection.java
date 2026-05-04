package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public SubMesh getSubMesh(int i11) {
            return this.subMeshes[i11];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i11, float[] fArr, float[] fArr2, int i12) {
            this.textureId = i11;
            Assertions.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i12;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public Projection(Mesh mesh, int i11) {
        this(mesh, mesh, i11);
    }

    public static Projection createEquirectangular(int i11) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i11);
    }

    public Projection(Mesh mesh, Mesh mesh2, int i11) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i11;
        this.singleMesh = mesh == mesh2;
    }

    public static Projection createEquirectangular(float f11, int i11, int i12, float f12, float f13, int i13) {
        int i14;
        int i15 = i11;
        Assertions.checkArgument(f11 > 0.0f);
        Assertions.checkArgument(i15 >= 1);
        Assertions.checkArgument(i12 >= 1);
        Assertions.checkArgument(f12 > 0.0f && f12 <= 180.0f);
        Assertions.checkArgument(f13 > 0.0f && f13 <= 360.0f);
        float radians = (float) Math.toRadians(f12);
        float radians2 = (float) Math.toRadians(f13);
        float f14 = radians / i15;
        float f15 = radians2 / i12;
        int i16 = i12 + 1;
        int i17 = ((i16 * 2) + 2) * i15;
        float[] fArr = new float[i17 * 3];
        float[] fArr2 = new float[i17 * 2];
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        while (i18 < i15) {
            float f16 = radians / 2.0f;
            float f17 = (i18 * f14) - f16;
            int i22 = i18 + 1;
            float f18 = (i22 * f14) - f16;
            int i23 = 0;
            while (i23 < i16) {
                float f19 = radians;
                float f21 = radians2;
                int i24 = 0;
                int i25 = 2;
                while (i24 < i25) {
                    float f22 = f14;
                    float f23 = i23 * f15;
                    float f24 = f15;
                    float f25 = f17;
                    double d11 = f11;
                    double d12 = (f23 + 3.1415927f) - (f21 / 2.0f);
                    double d13 = i24 == 0 ? f17 : f18;
                    fArr[i19] = -((float) (Math.cos(d13) * Math.sin(d12) * d11));
                    fArr[i19 + 1] = (float) (d11 * Math.sin(d13));
                    int i26 = i19 + 3;
                    fArr[i19 + 2] = (float) (d11 * Math.cos(d12) * Math.cos(d13));
                    fArr2[i21] = f23 / f21;
                    int i27 = i21 + 2;
                    fArr2[i21 + 1] = ((i18 + i24) * f22) / f19;
                    if ((i23 == 0 && i24 == 0) || (i23 == i12 && i24 == 1)) {
                        System.arraycopy(fArr, i19, fArr, i26, 3);
                        i19 += 6;
                        i14 = 2;
                        System.arraycopy(fArr2, i21, fArr2, i27, 2);
                        i21 += 4;
                    } else {
                        i14 = 2;
                        i19 = i26;
                        i21 = i27;
                    }
                    i24++;
                    i25 = i14;
                    f14 = f22;
                    f15 = f24;
                    f17 = f25;
                }
                i23++;
                radians2 = f21;
                radians = f19;
                f14 = f14;
            }
            i15 = i11;
            i18 = i22;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr, fArr2, 1)), i13);
    }
}
