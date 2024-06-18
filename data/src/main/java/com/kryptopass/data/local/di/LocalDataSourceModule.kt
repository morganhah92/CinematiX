package com.kryptopass.data.local.di

import com.kryptopass.data.local.source.LocalMovieDataSourceImpl
import com.kryptopass.data.repo.local.LocalMovieDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class LocalDataSourceModule {

    @Binds
    abstract fun bindMovieDataSource(dataSource: LocalMovieDataSourceImpl): LocalMovieDataSource
}