package androidx.datastore.preferences;

import androidx.annotation.RestrictTo;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class PreferencesMapCompat {

    @k
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final PreferencesProto.PreferenceMap readFrom(@k InputStream input) {
            g0.p(input, "input");
            try {
                PreferencesProto.PreferenceMap parseFrom = PreferencesProto.PreferenceMap.parseFrom(input);
                g0.o(parseFrom, "{\n                Prefer…From(input)\n            }");
                return parseFrom;
            } catch (InvalidProtocolBufferException e11) {
                throw new CorruptionException("Unable to parse preferences proto.", e11);
            }
        }

        private Companion() {
        }
    }
}
