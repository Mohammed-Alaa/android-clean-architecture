package com.marcobrenes.githubtrending.remote.service

import com.marcobrenes.githubtrending.remote.model.ProjectsResponseModel
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubTrendingService {

    @GET("search/repositories")
    fun searchRepositories(@Query("q") query: String,
                           @Query("sort") sortBy: String,
                           @Query("order") order: String)
            : Deferred<ProjectsResponseModel>
}
