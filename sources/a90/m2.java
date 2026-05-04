package a90;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f2413a = Pattern.compile("([1-9]\\d*) ?((?:[nμm]?s)|m|h|d)?", 66);

    /* renamed from: b, reason: collision with root package name */
    public static final Map<String, TimeUnit> f2414b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationStyle.NOTIFICATION_STYLE, TimeUnit.NANOSECONDS);
        hashMap.put("μs", TimeUnit.MICROSECONDS);
        hashMap.put("ms", TimeUnit.MILLISECONDS);
        hashMap.put("s", TimeUnit.SECONDS);
        hashMap.put("m", TimeUnit.MINUTES);
        hashMap.put(CmcdData.STREAMING_FORMAT_HLS, TimeUnit.HOURS);
        hashMap.put("d", TimeUnit.DAYS);
        f2414b = Collections.unmodifiableMap(hashMap);
    }

    public k2 a(CharSequence text) throws DateTimeParseException {
        Matcher matcher = f2413a.matcher(text);
        if (!matcher.matches()) {
            throw l2.a("Timeout duration is not in the expected format (<number> [ns|μs|ms|s|m|h|d])", text, 0);
        }
        long parseLong = Long.parseLong(matcher.group(1));
        String group = matcher.group(2);
        return new k2(parseLong, group == null ? TimeUnit.SECONDS : f2414b.get(group.toLowerCase(Locale.ENGLISH)));
    }
}
