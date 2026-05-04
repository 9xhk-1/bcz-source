package coil.memory;

import a00.l1;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.FloatRange;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import u0.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface MemoryCache {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Context f9705a;

        /* renamed from: b, reason: collision with root package name */
        public double f9706b;

        /* renamed from: c, reason: collision with root package name */
        public int f9707c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9708d = true;

        /* renamed from: e, reason: collision with root package name */
        public boolean f9709e = true;

        public a(@k Context context) {
            this.f9705a = context;
            this.f9706b = l.g(context);
        }

        @k
        public final MemoryCache a() {
            g aVar;
            h fVar = this.f9709e ? new f() : new coil.memory.b();
            if (this.f9708d) {
                double d11 = this.f9706b;
                int e11 = d11 > 0.0d ? l.e(this.f9705a, d11) : this.f9707c;
                aVar = e11 > 0 ? new e(e11, fVar) : new coil.memory.a(fVar);
            } else {
                aVar = new coil.memory.a(fVar);
            }
            return new d(aVar, fVar);
        }

        @k
        public final a b(int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("size must be >= 0.");
            }
            this.f9706b = 0.0d;
            this.f9707c = i11;
            return this;
        }

        @k
        public final a c(@FloatRange(from = 0.0d, to = 1.0d) double d11) {
            if (0.0d > d11 || d11 > 1.0d) {
                throw new IllegalArgumentException("size must be in the range [0.0, 1.0].");
            }
            this.f9707c = 0;
            this.f9706b = d11;
            return this;
        }

        @k
        public final a d(boolean z11) {
            this.f9708d = z11;
            return this;
        }

        @k
        public final a e(boolean z11) {
            this.f9709e = z11;
            return this;
        }
    }

    int a();

    void b(int i11);

    void clear();

    boolean d(@k Key key);

    @m80.l
    b e(@k Key key);

    void f(@k Key key, @k b bVar);

    @k
    Set<Key> getKeys();

    int getSize();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Key\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,216:1\n215#2,2:217\n*S KotlinDebug\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Key\n*L\n86#1:217,2\n*E\n"})
    public static final class Key implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9703a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, String> f9704b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final b f9702c = new b(null);

        @w00.g
        @Deprecated
        @k
        public static final Parcelable.Creator<Key> CREATOR = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements Parcelable.Creator<Key> {
            @Override // android.os.Parcelable.Creator
            @k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Key createFromParcel(@k Parcel parcel) {
                String readString = parcel.readString();
                g0.m(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i11 = 0; i11 < readInt; i11++) {
                    String readString2 = parcel.readString();
                    g0.m(readString2);
                    String readString3 = parcel.readString();
                    g0.m(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new Key(readString, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            @k
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Key[] newArray(int i11) {
                return new Key[i11];
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(v vVar) {
                this();
            }

            public b() {
            }
        }

        public Key(@k String str, @k Map<String, String> map) {
            this.f9703a = str;
            this.f9704b = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Key b(Key key, String str, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = key.f9703a;
            }
            if ((i11 & 2) != 0) {
                map = key.f9704b;
            }
            return key.a(str, map);
        }

        @k
        public final Key a(@k String str, @k Map<String, String> map) {
            return new Key(str, map);
        }

        @k
        public final Map<String, String> c() {
            return this.f9704b;
        }

        @k
        public final String d() {
            return this.f9703a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return g0.g(this.f9703a, key.f9703a) && g0.g(this.f9704b, key.f9704b);
        }

        public int hashCode() {
            return (this.f9703a.hashCode() * 31) + this.f9704b.hashCode();
        }

        @k
        public String toString() {
            return "Key(key=" + this.f9703a + ", extras=" + this.f9704b + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int i11) {
            parcel.writeString(this.f9703a);
            parcel.writeInt(this.f9704b.size());
            for (Map.Entry<String, String> entry : this.f9704b.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }

        public /* synthetic */ Key(String str, Map map, int i11, v vVar) {
            this(str, (i11 & 2) != 0 ? l1.z() : map);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Bitmap f9710a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, Object> f9711b;

        public b(@k Bitmap bitmap, @k Map<String, ? extends Object> map) {
            this.f9710a = bitmap;
            this.f9711b = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b b(b bVar, Bitmap bitmap, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bitmap = bVar.f9710a;
            }
            if ((i11 & 2) != 0) {
                map = bVar.f9711b;
            }
            return bVar.a(bitmap, map);
        }

        @k
        public final b a(@k Bitmap bitmap, @k Map<String, ? extends Object> map) {
            return new b(bitmap, map);
        }

        @k
        public final Bitmap c() {
            return this.f9710a;
        }

        @k
        public final Map<String, Object> d() {
            return this.f9711b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return g0.g(this.f9710a, bVar.f9710a) && g0.g(this.f9711b, bVar.f9711b);
        }

        public int hashCode() {
            return (this.f9710a.hashCode() * 31) + this.f9711b.hashCode();
        }

        @k
        public String toString() {
            return "Value(bitmap=" + this.f9710a + ", extras=" + this.f9711b + ')';
        }

        public /* synthetic */ b(Bitmap bitmap, Map map, int i11, v vVar) {
            this(bitmap, (i11 & 2) != 0 ? l1.z() : map);
        }
    }
}
