package cw;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.sina.weibo.BuildConfig;
import com.sina.weibo.sdk.api.VideoSourceObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import gw.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e extends AsyncTask<WeiboMultiMessage, Void, d> {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f46862a;

    /* renamed from: b, reason: collision with root package name */
    public c f46863b;

    public e(Context context, a aVar) {
        this.f46862a = new WeakReference<>(context);
        this.f46863b = aVar;
    }

    @Override // android.os.AsyncTask
    public final d doInBackground(WeiboMultiMessage[] weiboMultiMessageArr) {
        WeiboMultiMessage weiboMultiMessage;
        Uri uri;
        WeiboMultiMessage[] weiboMultiMessageArr2 = weiboMultiMessageArr;
        Context context = this.f46862a.get();
        if (context == null || (weiboMultiMessage = weiboMultiMessageArr2[0]) == null) {
            return null;
        }
        a.C0646a a11 = gw.a.a(context);
        String str = a11 != null ? a11.f57825a : "";
        if (TextUtils.isEmpty(str)) {
            str = BuildConfig.LIBRARY_PACKAGE_NAME;
        }
        d dVar = new d();
        try {
            if (weiboMultiMessage.imageObject != null && weiboMultiMessage.multiImageObject != null) {
                weiboMultiMessage.imageObject = null;
            }
            if (weiboMultiMessage.videoSourceObject != null && (weiboMultiMessage.imageObject != null || weiboMultiMessage.multiImageObject != null)) {
                weiboMultiMessage.imageObject = null;
                weiboMultiMessage.multiImageObject = null;
            }
            if (weiboMultiMessage.multiImageObject != null) {
                ArrayList<Uri> arrayList = new ArrayList<>();
                Iterator<Uri> it = weiboMultiMessage.multiImageObject.getImageList().iterator();
                while (it.hasNext()) {
                    Uri next = it.next();
                    if (next != null && gw.b.d(context, next)) {
                        arrayList.add(next);
                        context.grantUriPermission(str, next, 1);
                    }
                }
                weiboMultiMessage.multiImageObject.imageList = arrayList;
            }
            VideoSourceObject videoSourceObject = weiboMultiMessage.videoSourceObject;
            if (videoSourceObject != null && (uri = videoSourceObject.videoPath) != null && gw.b.e(context, uri)) {
                VideoSourceObject videoSourceObject2 = weiboMultiMessage.videoSourceObject;
                videoSourceObject2.videoPath = uri;
                videoSourceObject2.during = gw.b.a(gw.b.c(context, uri));
                context.grantUriPermission(str, weiboMultiMessage.videoSourceObject.videoPath, 1);
            }
            dVar.f46860b = weiboMultiMessage;
            dVar.f46859a = true;
        } catch (Throwable th2) {
            dVar.f46859a = false;
            String message = th2.getMessage();
            if (TextUtils.isEmpty(message)) {
                message = th2.toString();
            }
            dVar.f46861c = message;
            gw.c.b("WBShareTag", "prepare resource error is :" + message);
        }
        return dVar;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(d dVar) {
        d dVar2 = dVar;
        super.onPostExecute(dVar2);
        c cVar = this.f46863b;
        if (cVar != null) {
            a aVar = (a) cVar;
            aVar.f46858a.f41585b.setVisibility(4);
            if (dVar2 == null) {
                aVar.f46858a.a("Trans result is null.");
                return;
            }
            if (dVar2.f46859a) {
                aVar.f46858a.a(dVar2.f46860b);
            } else if (TextUtils.isEmpty(dVar2.f46861c)) {
                aVar.f46858a.a("Trans resource fail.");
            } else {
                aVar.f46858a.a(dVar2.f46861c);
            }
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
    }
}
