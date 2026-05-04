package androidx.datastore.preferences.core;

import a00.r0;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.okio.OkioSerializer;
import androidx.datastore.preferences.PreferencesMapCompat;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.protobuf.ByteString;
import j00.c;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.m;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPreferencesSerializer.jvmAndroid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferencesSerializer.jvmAndroid.kt\nandroidx/datastore/preferences/core/PreferencesSerializer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,114:1\n215#2,2:115\n*S KotlinDebug\n*F\n+ 1 PreferencesSerializer.jvmAndroid.kt\nandroidx/datastore/preferences/core/PreferencesSerializer\n*L\n50#1:115,2\n*E\n"})
/* loaded from: classes2.dex */
public final class PreferencesSerializer implements OkioSerializer<Preferences> {

    @k
    public static final PreferencesSerializer INSTANCE = new PreferencesSerializer();

    @k
    public static final String fileExtension = "preferences_pb";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            try {
                iArr[PreferencesProto.Value.ValueCase.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PreferencesSerializer() {
    }

    private final void addProtoEntryToPreferences(String str, PreferencesProto.Value value, MutablePreferences mutablePreferences) {
        PreferencesProto.Value.ValueCase valueCase = value.getValueCase();
        switch (valueCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[valueCase.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.set(PreferencesKeys.booleanKey(str), Boolean.valueOf(value.getBoolean()));
                return;
            case 2:
                mutablePreferences.set(PreferencesKeys.floatKey(str), Float.valueOf(value.getFloat()));
                return;
            case 3:
                mutablePreferences.set(PreferencesKeys.doubleKey(str), Double.valueOf(value.getDouble()));
                return;
            case 4:
                mutablePreferences.set(PreferencesKeys.intKey(str), Integer.valueOf(value.getInteger()));
                return;
            case 5:
                mutablePreferences.set(PreferencesKeys.longKey(str), Long.valueOf(value.getLong()));
                return;
            case 6:
                Preferences.Key<String> stringKey = PreferencesKeys.stringKey(str);
                String string = value.getString();
                g0.o(string, "value.string");
                mutablePreferences.set(stringKey, string);
                return;
            case 7:
                Preferences.Key<Set<String>> stringSetKey = PreferencesKeys.stringSetKey(str);
                List<String> stringsList = value.getStringSet().getStringsList();
                g0.o(stringsList, "value.stringSet.stringsList");
                mutablePreferences.set(stringSetKey, r0.f6(stringsList));
                return;
            case 8:
                Preferences.Key<byte[]> byteArrayKey = PreferencesKeys.byteArrayKey(str);
                byte[] byteArray = value.getBytes().toByteArray();
                g0.o(byteArray, "value.bytes.toByteArray()");
                mutablePreferences.set(byteArrayKey, byteArray);
                return;
            case 9:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final PreferencesProto.Value getValueProto(Object obj) {
        if (obj instanceof Boolean) {
            PreferencesProto.Value build = PreferencesProto.Value.newBuilder().setBoolean(((Boolean) obj).booleanValue()).build();
            g0.o(build, "newBuilder().setBoolean(value).build()");
            return build;
        }
        if (obj instanceof Float) {
            PreferencesProto.Value build2 = PreferencesProto.Value.newBuilder().setFloat(((Number) obj).floatValue()).build();
            g0.o(build2, "newBuilder().setFloat(value).build()");
            return build2;
        }
        if (obj instanceof Double) {
            PreferencesProto.Value build3 = PreferencesProto.Value.newBuilder().setDouble(((Number) obj).doubleValue()).build();
            g0.o(build3, "newBuilder().setDouble(value).build()");
            return build3;
        }
        if (obj instanceof Integer) {
            PreferencesProto.Value build4 = PreferencesProto.Value.newBuilder().setInteger(((Number) obj).intValue()).build();
            g0.o(build4, "newBuilder().setInteger(value).build()");
            return build4;
        }
        if (obj instanceof Long) {
            PreferencesProto.Value build5 = PreferencesProto.Value.newBuilder().setLong(((Number) obj).longValue()).build();
            g0.o(build5, "newBuilder().setLong(value).build()");
            return build5;
        }
        if (obj instanceof String) {
            PreferencesProto.Value build6 = PreferencesProto.Value.newBuilder().setString((String) obj).build();
            g0.o(build6, "newBuilder().setString(value).build()");
            return build6;
        }
        if (obj instanceof Set) {
            PreferencesProto.Value.Builder newBuilder = PreferencesProto.Value.newBuilder();
            PreferencesProto.StringSet.Builder newBuilder2 = PreferencesProto.StringSet.newBuilder();
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            PreferencesProto.Value build7 = newBuilder.setStringSet(newBuilder2.addAllStrings((Set) obj)).build();
            g0.o(build7, "newBuilder()\n           …                 .build()");
            return build7;
        }
        if (obj instanceof byte[]) {
            PreferencesProto.Value build8 = PreferencesProto.Value.newBuilder().setBytes(ByteString.copyFrom((byte[]) obj)).build();
            g0.o(build8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return build8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    @l
    public Object readFrom(@k m mVar, @k c<? super Preferences> cVar) throws IOException, CorruptionException {
        PreferencesProto.PreferenceMap readFrom = PreferencesMapCompat.Companion.readFrom(mVar.R8());
        MutablePreferences createMutable = PreferencesFactory.createMutable(new Preferences.Pair[0]);
        Map<String, PreferencesProto.Value> preferencesMap = readFrom.getPreferencesMap();
        g0.o(preferencesMap, "preferencesProto.preferencesMap");
        for (Map.Entry<String, PreferencesProto.Value> entry : preferencesMap.entrySet()) {
            String name = entry.getKey();
            PreferencesProto.Value value = entry.getValue();
            PreferencesSerializer preferencesSerializer = INSTANCE;
            g0.o(name, "name");
            g0.o(value, "value");
            preferencesSerializer.addProtoEntryToPreferences(name, value, createMutable);
        }
        return createMutable.toPreferences();
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public /* bridge */ /* synthetic */ Object writeTo(Preferences preferences, l60.l lVar, c cVar) {
        return writeTo2(preferences, lVar, (c<? super g2>) cVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.okio.OkioSerializer
    @k
    public Preferences getDefaultValue() {
        return PreferencesFactory.createEmpty();
    }

    @l
    /* renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(@k Preferences preferences, @k l60.l lVar, @k c<? super g2> cVar) throws IOException, CorruptionException {
        Map<Preferences.Key<?>, Object> asMap = preferences.asMap();
        PreferencesProto.PreferenceMap.Builder newBuilder = PreferencesProto.PreferenceMap.newBuilder();
        for (Map.Entry<Preferences.Key<?>, Object> entry : asMap.entrySet()) {
            newBuilder.putPreferences(entry.getKey().getName(), getValueProto(entry.getValue()));
        }
        newBuilder.build().writeTo(lVar.O8());
        return g2.f100423a;
    }
}
