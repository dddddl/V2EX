package com.ecovacs.v2ex.module;

import android.arch.lifecycle.ViewModelProvider;

import com.ecovacs.baselibrary.base.rx.SchedulerProvider;
import com.ecovacs.data.DataManager;
import com.ecovacs.data.ViewModelProviderFactory;
import com.ecovacs.data.bean.NodesInfo;
import com.ecovacs.v2ex.adapter.NodesAdapter;
import com.ecovacs.v2ex.viewmodel.NodesViewModel;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liang.liu on 2018/4/11.
 */
@Module
public class NodesFragmentModule {

    @Provides
    NodesViewModel nodesViewModel(DataManager dataManager,
                                  SchedulerProvider schedulerProvider) {
        return new NodesViewModel(dataManager, schedulerProvider);
    }

    @Provides
    ViewModelProvider.Factory provideNodesViewModel(NodesViewModel nodesViewModel) {
        return new ViewModelProviderFactory<>(nodesViewModel);
    }

    @Provides
    NodesAdapter provideNodesAdapter() {
        return new NodesAdapter(new ArrayList<NodesInfo.Item>());
    }
}
