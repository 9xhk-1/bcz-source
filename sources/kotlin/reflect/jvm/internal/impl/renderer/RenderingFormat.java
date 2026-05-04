package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import u30.f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class RenderingFormat {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ RenderingFormat[] $VALUES;
    public static final RenderingFormat PLAIN = new RenderingFormat("PLAIN", 0) { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.b
        {
            v vVar = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        @k
        public String escape(@k String string) {
            g0.p(string, "string");
            return string;
        }
    };
    public static final RenderingFormat HTML = new RenderingFormat("HTML", 1) { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.a
        {
            v vVar = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        @k
        public String escape(@k String string) {
            g0.p(string, "string");
            return f0.z2(f0.z2(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    private static final /* synthetic */ RenderingFormat[] $values() {
        return new RenderingFormat[]{PLAIN, HTML};
    }

    static {
        RenderingFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    public /* synthetic */ RenderingFormat(String str, int i11, v vVar) {
        this(str, i11);
    }

    public static RenderingFormat valueOf(String str) {
        return (RenderingFormat) Enum.valueOf(RenderingFormat.class, str);
    }

    public static RenderingFormat[] values() {
        return (RenderingFormat[]) $VALUES.clone();
    }

    @k
    public abstract String escape(@k String str);

    private RenderingFormat(String str, int i11) {
    }
}
