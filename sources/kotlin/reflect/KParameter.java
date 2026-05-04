package kotlin.reflect;

import com.baicizhan.client.business.dataset.provider.a;
import h10.b;
import h10.r;
import m00.c;
import m80.k;
import m80.l;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface KParameter extends b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Kind {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind INSTANCE = new Kind("INSTANCE", 0);

        @kotlin.b
        public static final Kind CONTEXT = new Kind("CONTEXT", 1);
        public static final Kind EXTENSION_RECEIVER = new Kind("EXTENSION_RECEIVER", 2);
        public static final Kind VALUE = new Kind(a.h.C0249a.f16197b, 3);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{INSTANCE, CONTEXT, EXTENSION_RECEIVER, VALUE};
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private Kind(String str, int i11) {
        }

        @k
        public static m00.a<Kind> getEntries() {
            return $ENTRIES;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    boolean b();

    int getIndex();

    @k
    Kind getKind();

    @l
    String getName();

    @k
    r getType();

    boolean isOptional();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @y0(version = "1.1")
        public static /* synthetic */ void a() {
        }
    }
}
