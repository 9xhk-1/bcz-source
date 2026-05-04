package com.baicizhan.client.business.thrift;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.thrift.TServiceClient;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class ThriftRequest<Client extends TServiceClient, Result> implements Comparable<ThriftRequest<Client, Result>> {
    private static Handler sHandler = new Handler(Looper.getMainLooper());
    private AtomicBoolean mCanceled;
    private Client mClient;
    private String mDomain;
    private Priority mPriority;
    private String mTag;
    protected Thread thread;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Priority {
        HIGH,
        NORMAL,
        LOW
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Exception f16549a;

        public a(final Exception val$exception) {
            this.f16549a = val$exception;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ThriftRequest.this.isCanceled()) {
                return;
            }
            ThriftRequest.this.onError(this.f16549a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f16551a;

        public b(final Object val$result) {
            this.f16551a = val$result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (ThriftRequest.this.isCanceled()) {
                return;
            }
            ThriftRequest.this.onResult(this.f16551a);
        }
    }

    public ThriftRequest(String domain) {
        this.mCanceled = new AtomicBoolean(false);
        this.mTag = null;
        this.mPriority = Priority.NORMAL;
        this.mDomain = domain;
    }

    public void cancel() {
        this.mCanceled.set(true);
    }

    public abstract Result doInBackground(final Client client) throws Exception;

    public final void execute(r rVar) {
        Client client = null;
        try {
            try {
                if (isCanceled()) {
                    return;
                }
                client = (Client) rVar.c(getDomain());
                this.mClient = client;
                Result doInBackground = doInBackground(client);
                if (isCanceled()) {
                    if (client != null) {
                        rVar.e(client);
                    }
                } else {
                    postResult(doInBackground);
                    if (client != null) {
                        rVar.e(client);
                    }
                }
            } catch (Exception e11) {
                if (!isCanceled()) {
                    postError(e11);
                }
                if (client != null) {
                    rVar.e(client);
                }
            }
        } catch (Throwable th2) {
            if (client != null) {
                rVar.e(client);
            }
            throw th2;
        }
    }

    public String getDomain() {
        return this.mDomain;
    }

    public final k getHttpClient() {
        return r.i(this.mClient);
    }

    public Priority getPriority() {
        return this.mPriority;
    }

    public String getTag() {
        return this.mTag;
    }

    public boolean isCanceled() {
        return this.mCanceled.get();
    }

    public abstract void onError(Exception exception);

    public abstract void onResult(Result result);

    public final void post(Runnable runnable) {
        sHandler.post(runnable);
    }

    public final void postError(final Exception exception) {
        sHandler.post(new a(exception));
    }

    public final void postResult(final Result result) {
        sHandler.post(new b(result));
    }

    public void setPriority(Priority priority) {
        this.mPriority = priority;
    }

    public void setTag(String tag) {
        this.mTag = tag;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull ThriftRequest<Client, Result> another) {
        return getPriority().ordinal() - another.getPriority().ordinal();
    }

    public ThriftRequest(String domain, String tag) {
        this(domain);
        setTag(tag);
    }
}
