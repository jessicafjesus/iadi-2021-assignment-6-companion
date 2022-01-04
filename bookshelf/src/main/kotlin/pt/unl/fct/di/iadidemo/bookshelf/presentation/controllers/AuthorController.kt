package pt.unl.fct.di.iadidemo.bookshelf.presentation.controllers

import org.springframework.web.bind.annotation.RestController
import pt.unl.fct.di.iadidemo.bookshelf.application.services.AuthorService
import pt.unl.fct.di.iadidemo.bookshelf.config.*
import pt.unl.fct.di.iadidemo.bookshelf.presentation.api.AuthorAPI
import pt.unl.fct.di.iadidemo.bookshelf.presentation.api.dto.*

/**
 * This is a sample class implementing the presentation logic layer for REST services,
 * the controller layer.
 *
 * Each controller implements a set of endpoints declared in a API interface. It performs
 * data format transformation and prepares answers to the REST clients.
 *
 * This controller implements two sample endpoints that use and orchestrate methods
 * from one or more components from the service layer. Notice the use of DTO classes
 * to define the types of the enpoint parameters and results. Data transformations are
 * necessary in all cases.
 */

@RestController
class AuthorController(val authors: AuthorService) : AuthorAPI {

    @CanSeeAuthors
    override fun getAll(): List<AuthorDTO> =
        authors.getAll().map { AuthorDTO(
            it.id,
            it.name
        ) }

    override fun addOne(elem: AuthorsBookDTO) {
        TODO("Not yet implemented")
    }

    override fun getOne(id: Long): AuthorDTO {
        TODO("Not yet implemented")
    }

    override fun updateOne(id: Long, elem: AuthorsBookDTO) {
        TODO("Not yet implemented")
    }

    override fun deleteOne(id: Long) {
        TODO("Not yet implemented")
    }

}