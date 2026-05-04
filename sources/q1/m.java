package q1;

import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface m {
    m a(Map<String, ?> map);

    int b(String str, int i11);

    m c(String str, int i11);

    void clear();

    boolean contains(String str);

    void flush();

    Map<String, ?> get();

    boolean getBoolean(String str);

    boolean getBoolean(String str, boolean z11);

    float getFloat(String str);

    float getFloat(String str, float f11);

    int getInteger(String str);

    long getLong(String str);

    long getLong(String str, long j11);

    String getString(String str);

    String getString(String str, String str2);

    m putBoolean(String str, boolean z11);

    m putFloat(String str, float f11);

    m putLong(String str, long j11);

    m putString(String str, String str2);

    void remove(String str);
}
