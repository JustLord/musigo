package by.sfsas.music.features.main;

import javax.inject.Inject;

import by.sfsas.domain.interactors.MainInteractor;
import by.sfsas.music.features.base.BasePresenter;

public class MainPresenter extends BasePresenter<MainView> {

    private final MainInteractor interactor;

    @Inject
    MainPresenter(MainInteractor interactor) {
        this.interactor = interactor;
    }


    @Override
    protected void clearComponent() {

    }
}
