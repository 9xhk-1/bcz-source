package gi;

import android.content.res.Resources;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.PathUtil;
import com.jiongji.andriod.card.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<Integer, String> f53730a;

    static {
        HashMap hashMap = new HashMap(2);
        f53730a = hashMap;
        hashMap.put(Integer.valueOf(R.raw.jiongdailycloze), a.c.f16136k);
        hashMap.put(Integer.valueOf(R.raw.lookup), a.c.f16137l);
    }

    public static void a(Resources res, int rawId) throws Exception {
        FileUtils.unzipRawFileToSDCard(res, rawId, PathUtil.getBaicizhanAppRoot(), f53730a.get(Integer.valueOf(rawId)));
    }
}
