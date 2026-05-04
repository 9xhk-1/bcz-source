package androidx.media3.common.util;

import android.content.Context;
import android.opengl.GLES20;
import androidx.annotation.Nullable;
import androidx.media3.common.util.GlUtil;
import java.io.IOException;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class GlProgram {
    private static final int GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT = 35815;
    private final Map<String, Attribute> attributeByName;
    private final Attribute[] attributes;
    private boolean externalTexturesRequireNearestSampling;
    private final int programId;
    private final Map<String, Uniform> uniformByName;
    private final Uniform[] uniforms;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Attribute {

        @Nullable
        private Buffer buffer;
        private final int location;
        public final String name;
        private int size;

        private Attribute(String str, int i11) {
            this.name = str;
            this.location = i11;
        }

        public static Attribute create(int i11, int i12) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i11, com.badlogic.gdx.graphics.f.f11560b2, iArr, 0);
            int i13 = iArr[0];
            byte[] bArr = new byte[i13];
            GLES20.glGetActiveAttrib(i11, i12, i13, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, GlProgram.getCStringLength(bArr));
            return new Attribute(str, GlProgram.getAttributeLocation(i11, str));
        }

        public void bind() throws GlUtil.GlException {
            Buffer buffer = (Buffer) Assertions.checkNotNull(this.buffer, "call setBuffer before bind");
            GLES20.glBindBuffer(com.badlogic.gdx.graphics.f.N, 0);
            GLES20.glVertexAttribPointer(this.location, this.size, com.badlogic.gdx.graphics.f.f11703z1, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.location);
            GlUtil.checkGlError();
        }

        public void setBuffer(float[] fArr, int i11) {
            this.buffer = GlUtil.createBuffer(fArr);
            this.size = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Uniform {
        private final int location;
        public final String name;
        private int texIdValue;
        private int texUnitIndex;
        private final int type;
        private final float[] floatValue = new float[16];
        private final int[] intValue = new int[4];
        private int texMinFilter = 9729;

        private Uniform(String str, int i11, int i12) {
            this.name = str;
            this.location = i11;
            this.type = i12;
        }

        public static Uniform create(int i11, int i12) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i11, com.badlogic.gdx.graphics.f.Z1, iArr, 0);
            int[] iArr2 = new int[1];
            int i13 = iArr[0];
            byte[] bArr = new byte[i13];
            GLES20.glGetActiveUniform(i11, i12, i13, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, GlProgram.getCStringLength(bArr));
            return new Uniform(str, GlProgram.getUniformLocation(i11, str), iArr2[0]);
        }

        public void bind(boolean z11) throws GlUtil.GlException {
            int i11 = this.type;
            if (i11 == 5124) {
                GLES20.glUniform1iv(this.location, 1, this.intValue, 0);
                GlUtil.checkGlError();
                return;
            }
            if (i11 == 5126) {
                GLES20.glUniform1fv(this.location, 1, this.floatValue, 0);
                GlUtil.checkGlError();
                return;
            }
            if (i11 == 35678 || i11 == GlProgram.GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT || i11 == 36198) {
                if (this.texIdValue == 0) {
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                }
                GLES20.glActiveTexture(this.texUnitIndex + com.badlogic.gdx.graphics.f.R2);
                GlUtil.checkGlError();
                int i12 = this.type;
                GlUtil.bindTexture(i12 == 35678 ? 3553 : 36197, this.texIdValue, (i12 == 35678 || !z11) ? 9729 : com.badlogic.gdx.graphics.f.f11692x2);
                if (this.type == 35678) {
                    if (this.texMinFilter == 9987) {
                        GLES20.glGenerateMipmap(com.badlogic.gdx.graphics.f.f11552a0);
                        GlUtil.checkGlError();
                    }
                    GLES20.glTexParameteri(com.badlogic.gdx.graphics.f.f11552a0, com.badlogic.gdx.graphics.f.E2, this.texMinFilter);
                    GlUtil.checkGlError();
                }
                GLES20.glUniform1i(this.location, this.texUnitIndex);
                GlUtil.checkGlError();
                return;
            }
            switch (i11) {
                case com.badlogic.gdx.graphics.f.B3 /* 35664 */:
                    GLES20.glUniform2fv(this.location, 1, this.floatValue, 0);
                    GlUtil.checkGlError();
                    return;
                case com.badlogic.gdx.graphics.f.C3 /* 35665 */:
                    GLES20.glUniform3fv(this.location, 1, this.floatValue, 0);
                    GlUtil.checkGlError();
                    return;
                case com.badlogic.gdx.graphics.f.D3 /* 35666 */:
                    GLES20.glUniform4fv(this.location, 1, this.floatValue, 0);
                    GlUtil.checkGlError();
                    return;
                case com.badlogic.gdx.graphics.f.E3 /* 35667 */:
                    GLES20.glUniform2iv(this.location, 1, this.intValue, 0);
                    GlUtil.checkGlError();
                    return;
                case com.badlogic.gdx.graphics.f.F3 /* 35668 */:
                    GLES20.glUniform3iv(this.location, 1, this.intValue, 0);
                    GlUtil.checkGlError();
                    return;
                case com.badlogic.gdx.graphics.f.G3 /* 35669 */:
                    GLES20.glUniform4iv(this.location, 1, this.intValue, 0);
                    GlUtil.checkGlError();
                    return;
                default:
                    switch (i11) {
                        case com.badlogic.gdx.graphics.f.M3 /* 35675 */:
                            GLES20.glUniformMatrix3fv(this.location, 1, false, this.floatValue, 0);
                            GlUtil.checkGlError();
                            return;
                        case com.badlogic.gdx.graphics.f.N3 /* 35676 */:
                            GLES20.glUniformMatrix4fv(this.location, 1, false, this.floatValue, 0);
                            GlUtil.checkGlError();
                            return;
                        default:
                            throw new IllegalStateException("Unexpected uniform type: " + this.type);
                    }
            }
        }

        public void setFloat(float f11) {
            this.floatValue[0] = f11;
        }

        public void setFloats(float[] fArr) {
            System.arraycopy(fArr, 0, this.floatValue, 0, fArr.length);
        }

        public void setInt(int i11) {
            this.intValue[0] = i11;
        }

        public void setInts(int[] iArr) {
            System.arraycopy(iArr, 0, this.intValue, 0, iArr.length);
        }

        public void setSamplerTexId(int i11, int i12) {
            this.texIdValue = i11;
            this.texUnitIndex = i12;
        }

        public void setTexMinFilter(int i11) {
            this.texMinFilter = i11;
        }
    }

    public GlProgram(Context context, String str, String str2) throws IOException, GlUtil.GlException {
        this(Util.loadAsset(context, str), Util.loadAsset(context, str2));
    }

    private static void addShader(int i11, int i12, String str) throws GlUtil.GlException {
        int glCreateShader = GLES20.glCreateShader(i12);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, com.badlogic.gdx.graphics.f.Z3, iArr, 0);
        GlUtil.checkGlException(iArr[0] == 1, GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i11, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        GlUtil.checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getAttributeLocation(int i11, String str) {
        return GLES20.glGetAttribLocation(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCStringLength(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (bArr[i11] == 0) {
                return i11;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUniformLocation(int i11, String str) {
        return GLES20.glGetUniformLocation(i11, str);
    }

    public void bindAttributesAndUniforms() throws GlUtil.GlException {
        for (Attribute attribute : this.attributes) {
            attribute.bind();
        }
        for (Uniform uniform : this.uniforms) {
            uniform.bind(this.externalTexturesRequireNearestSampling);
        }
    }

    public void delete() throws GlUtil.GlException {
        GLES20.glDeleteProgram(this.programId);
        GlUtil.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(String str) throws GlUtil.GlException {
        int attributeLocation = getAttributeLocation(str);
        GLES20.glEnableVertexAttribArray(attributeLocation);
        GlUtil.checkGlError();
        return attributeLocation;
    }

    public void setBufferAttribute(String str, float[] fArr, int i11) {
        ((Attribute) Assertions.checkNotNull(this.attributeByName.get(str))).setBuffer(fArr, i11);
    }

    public void setExternalTexturesRequireNearestSampling(boolean z11) {
        this.externalTexturesRequireNearestSampling = z11;
    }

    public void setFloatUniform(String str, float f11) {
        ((Uniform) Assertions.checkNotNull(this.uniformByName.get(str))).setFloat(f11);
    }

    public void setFloatsUniform(String str, float[] fArr) {
        ((Uniform) Assertions.checkNotNull(this.uniformByName.get(str))).setFloats(fArr);
    }

    public void setFloatsUniformIfPresent(String str, float[] fArr) {
        Uniform uniform = this.uniformByName.get(str);
        if (uniform == null) {
            return;
        }
        uniform.setFloats(fArr);
    }

    public void setIntUniform(String str, int i11) {
        ((Uniform) Assertions.checkNotNull(this.uniformByName.get(str))).setInt(i11);
    }

    public void setIntsUniform(String str, int[] iArr) {
        ((Uniform) Assertions.checkNotNull(this.uniformByName.get(str))).setInts(iArr);
    }

    public void setSamplerTexIdUniform(String str, int i11, int i12) {
        ((Uniform) Assertions.checkNotNull(this.uniformByName.get(str))).setSamplerTexId(i11, i12);
    }

    public void use() throws GlUtil.GlException {
        GLES20.glUseProgram(this.programId);
        GlUtil.checkGlError();
    }

    private int getAttributeLocation(String str) {
        return getAttributeLocation(this.programId, str);
    }

    public int getUniformLocation(String str) {
        return getUniformLocation(this.programId, str);
    }

    public void setSamplerTexIdUniform(String str, int i11, int i12, int i13) {
        Uniform uniform = (Uniform) Assertions.checkNotNull(this.uniformByName.get(str));
        uniform.setSamplerTexId(i11, i12);
        uniform.setTexMinFilter(i13);
    }

    public GlProgram(String str, String str2) throws GlUtil.GlException {
        int glCreateProgram = GLES20.glCreateProgram();
        this.programId = glCreateProgram;
        GlUtil.checkGlError();
        addShader(glCreateProgram, com.badlogic.gdx.graphics.f.L1, str);
        addShader(glCreateProgram, com.badlogic.gdx.graphics.f.K1, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, com.badlogic.gdx.graphics.f.V1, iArr, 0);
        GlUtil.checkGlException(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glUseProgram(glCreateProgram);
        this.attributeByName = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, com.badlogic.gdx.graphics.f.f11554a2, iArr2, 0);
        this.attributes = new Attribute[iArr2[0]];
        for (int i11 = 0; i11 < iArr2[0]; i11++) {
            Attribute create = Attribute.create(this.programId, i11);
            this.attributes[i11] = create;
            this.attributeByName.put(create.name, create);
        }
        this.uniformByName = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.programId, com.badlogic.gdx.graphics.f.Y1, iArr3, 0);
        this.uniforms = new Uniform[iArr3[0]];
        for (int i12 = 0; i12 < iArr3[0]; i12++) {
            Uniform create2 = Uniform.create(this.programId, i12);
            this.uniforms[i12] = create2;
            this.uniformByName.put(create2.name, create2);
        }
        GlUtil.checkGlError();
    }
}
