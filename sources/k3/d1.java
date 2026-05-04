package k3;

import com.baicizhan.app.api.service.PluginException;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface d1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a extends d1 {
        @m80.k
        List<q1> a(@m80.k String str) throws PluginException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b extends d1 {
        @m80.l
        Object d(@m80.k String str, @m80.k j00.c<? super List<q1>> cVar) throws PluginException, CancellationException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c extends d1 {
        void e(@m80.k List<String> list) throws PluginException, CancellationException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d extends d1 {
        @m80.k
        h4 f(int i11) throws PluginException;

        void g(int i11, int i12, @m80.k List<Long> list) throws PluginException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e extends d1 {
        @m80.l
        Object b(int i11, int i12, @m80.k List<Long> list, @m80.k j00.c<? super yz.g2> cVar) throws PluginException, CancellationException;

        @m80.l
        Object c(int i11, @m80.k j00.c<? super h4> cVar) throws PluginException, CancellationException;
    }
}
