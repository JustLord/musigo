package by.sfsas.domain.repository;

import by.sfsas.domain.entity.Playlist;

public interface IRepository {
    Playlist getPlaylistByOwner();
}
