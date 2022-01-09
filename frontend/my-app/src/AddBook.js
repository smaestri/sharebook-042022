import React from 'react'
import { useState, useEffect } from 'react'
import axios from 'axios';
import { useParams } from 'react-router-dom'
import "./AddBook.scss"

export default function AddBook() {
    let { bookId } = useParams();
    const [bookData, setBookData] = React.useState({name: '', categoryId: 1 })
    const [categoriesData, setCategoriesData] = useState([])

    useEffect(() => {
        axios.get('/categories').then(response => {
            setCategoriesData(response.data)
        })
    }, []);

    if (bookId) {
        return "update book"
    }

    const handleChange = (event) => {
        let currentState = {...bookData};
        currentState[event.target.name] = event.target.value;
        setBookData(currentState)
    }

    const onSubmit = (event) => {
        event.preventDefault();
        console.log("onSubmit")
        console.log(bookData)
        // TODO
    }

    return (
        <div className="container-add-book">
            <h1>Ajouter un livre</h1>
            <form onSubmit={onSubmit}>
                <div>
                    <label>Nom du livre</label>
                    <input name="name" type="text" onChange={handleChange} className="form-control"></input>
                </div>
                <div>
                    <label>Catégorie du livre</label>
                    <select name="categoryId" onChange={handleChange} className="form-control">
                        {categoriesData.map(category => (
                            <option key={category.id} value={category.id}>{category.label}</option>
                        ))}
                    </select>
                </div>
                <div className="container-submit">
                    <input type="submit" value='Valider' className="btn btn-primary"></input>
                </div>

            </form>
        </div>
    )
}
