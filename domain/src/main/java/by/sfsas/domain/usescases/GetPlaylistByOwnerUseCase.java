package by.sfsas.domain.usescases;

import javax.inject.Inject;

import by.sfsas.domain.entity.Playlist;
import by.sfsas.domain.repository.IRepository;

public class GetPlaylistByOwnerUseCase {

    private final IRepository iRepository;

    @Inject
    public GetPlaylistByOwnerUseCase(IRepository iRepository) {
        this.iRepository = iRepository;
    }

    public Playlist execute(){
        return iRepository.getPlaylistByOwner();
    }
}
