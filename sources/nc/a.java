package nc;

import android.content.SharedPreferences;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.tencent.mmkv.MMKV;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public MMKV f75050a;

    public a(MMKV mmkv) {
        if (mmkv == null) {
            throw new NullPointerException("null == mmkv");
        }
        this.f75050a = mmkv;
    }

    public String[] a() {
        return this.f75050a.allKeys();
    }

    public void b() {
        this.f75050a.clearAll();
    }

    public long c() {
        return this.f75050a.count();
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String key) {
        return this.f75050a.contains(key);
    }

    public byte[] d(String key) {
        return this.f75050a.decodeBytes(key, (byte[]) null);
    }

    public byte[] e(String key, byte[] defaultValue) {
        return this.f75050a.decodeBytes(key, defaultValue);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this.f75050a.edit();
    }

    public <T extends Parcelable> T f(String str, Class<T> cls) {
        return (T) this.f75050a.decodeParcelable(str, cls, null);
    }

    public <T extends Parcelable> T g(String str, Class<T> cls, T t11) {
        return (T) this.f75050a.decodeParcelable(str, cls, t11);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        return this.f75050a.getAll();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String key, boolean defValue) {
        return this.f75050a.getBoolean(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String key, float defValue) {
        return this.f75050a.getFloat(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String key, int defValue) {
        return this.f75050a.getInt(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String key, long defValue) {
        return this.f75050a.getLong(key, defValue);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public String getString(String key, @Nullable String defValue) {
        return this.f75050a.getString(key, defValue);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public Set<String> getStringSet(String key, @Nullable Set<String> defValues) {
        return this.f75050a.getStringSet(key, defValues);
    }

    public int h(String key) {
        return this.f75050a.getValueActualSize(key);
    }

    public void i() {
        this.f75050a.lock();
    }

    public void j(String key, boolean value) {
        this.f75050a.encode(key, value);
    }

    public boolean k(String key, byte[] value) {
        return this.f75050a.encode(key, value);
    }

    public void l(String key, float value) {
        this.f75050a.encode(key, value);
    }

    public void m(String key, int value) {
        this.f75050a.encode(key, value);
    }

    public void n(String key, long value) {
        this.f75050a.encode(key, value);
    }

    public boolean o(String key, Parcelable value) {
        return this.f75050a.encode(key, value);
    }

    public void p(String key, String value) {
        this.f75050a.encode(key, value);
    }

    public void q(String key, Set<String> values) {
        this.f75050a.encode(key, values);
    }

    public void r(String key) {
        this.f75050a.remove(key);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        this.f75050a.registerOnSharedPreferenceChangeListener(listener);
    }

    public long s() {
        return this.f75050a.totalSize();
    }

    public boolean t() {
        return this.f75050a.tryLock();
    }

    public void u() {
        this.f75050a.unlock();
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        this.f75050a.unregisterOnSharedPreferenceChangeListener(listener);
    }
}
