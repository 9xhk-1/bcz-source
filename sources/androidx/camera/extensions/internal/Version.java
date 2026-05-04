package androidx.camera.extensions.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.mipush.sdk.Constants;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class Version implements Comparable<Version> {
    public static final Version VERSION_1_0 = create(1, 0, 0, "");
    public static final Version VERSION_1_1 = create(1, 1, 0, "");
    public static final Version VERSION_1_2 = create(1, 2, 0, "");
    public static final Version VERSION_1_3 = create(1, 3, 0, "");
    public static final Version VERSION_1_4 = create(1, 4, 0, "");
    private static final Pattern VERSION_STRING_PATTERN = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    @NonNull
    public static Version create(int i11, int i12, int i13, @NonNull String str) {
        return new AutoValue_Version(i11, i12, i13, str);
    }

    private static BigInteger createBigInteger(Version version) {
        return BigInteger.valueOf(version.getMajor()).shiftLeft(32).or(BigInteger.valueOf(version.getMinor())).shiftLeft(32).or(BigInteger.valueOf(version.getPatch()));
    }

    @Nullable
    public static Version parse(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = VERSION_STRING_PATTERN.matcher(str);
        if (matcher.matches()) {
            return create(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return Integer.valueOf(getMajor()).equals(Integer.valueOf(version.getMajor())) && Integer.valueOf(getMinor()).equals(Integer.valueOf(version.getMinor())) && Integer.valueOf(getPatch()).equals(Integer.valueOf(version.getPatch()));
    }

    public abstract String getDescription();

    public abstract int getMajor();

    public abstract int getMinor();

    public abstract int getPatch();

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(getMajor()), Integer.valueOf(getMinor()), Integer.valueOf(getPatch()));
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(getMajor() + "." + getMinor() + "." + getPatch());
        if (!TextUtils.isEmpty(getDescription())) {
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER + getDescription());
        }
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Version version) {
        return createBigInteger(this).compareTo(createBigInteger(version));
    }

    public int compareTo(int i11) {
        return compareTo(i11, 0);
    }

    public int compareTo(int i11, int i12) {
        if (getMajor() == i11) {
            return Integer.compare(getMinor(), i12);
        }
        return Integer.compare(getMajor(), i11);
    }
}
