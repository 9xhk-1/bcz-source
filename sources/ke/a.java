package ke;

import com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo;
import com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository;
import com.baicizhan.main.activity.mytab.task.data.g;
import javax.inject.Singleton;
import m80.k;
import nu.h;
import pu.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e({fv.a.class})
@h
/* loaded from: classes4.dex */
public interface a {
    @Singleton
    @nu.a
    @k
    com.baicizhan.main.activity.mytab.task.data.h a(@k CachedTasksRepository cachedTasksRepository);

    @Singleton
    @nu.a
    @k
    g b(@k CacheAchievementRepo cacheAchievementRepo);
}
