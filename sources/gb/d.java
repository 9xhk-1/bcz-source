package gb;

import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.online.bcz_system_api.BczSystemInfos;
import java.util.List;
import q9.x;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f53556a = "http://ws.bczcdn.com";

    /* renamed from: b, reason: collision with root package name */
    public static final String f53557b = "http://7n.bczcdn.com";

    /* renamed from: c, reason: collision with root package name */
    public static final String f53558c = "word_fm_audio_pack";

    /* renamed from: d, reason: collision with root package name */
    public static final String f53559d = PathUtil.BCZ_HOME + "/" + f53558c;

    public static String a() {
        BczSystemInfos j11 = x.r().j();
        if (j11 == null) {
            return f53557b;
        }
        List<String> list = j11.res_dns;
        return (e.h(list) || list.size() < 1) ? f53556a : list.get(1);
    }

    public static String b() {
        BczSystemInfos j11 = x.r().j();
        if (j11 == null) {
            return f53556a;
        }
        List<String> list = j11.res_dns;
        return e.h(list) ? f53556a : list.get(0);
    }

    public static String c(String path) {
        String d11 = d(path, ".amr");
        return d11 == null ? d(path, ".m4a") : d11;
    }

    public static String d(String path, String suffix) {
        if (path == null) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(suffix);
        if (lastIndexOf < 0) {
            if (path.lastIndexOf(PathUtil.BAICIZHAN_RESOURCE_EXTENSION) > 0) {
                return path;
            }
            return null;
        }
        return path.substring(0, lastIndexOf) + PathUtil.BAICIZHAN_RESOURCE_EXTENSION;
    }
}
