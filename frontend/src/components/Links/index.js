import { Link } from "react-router-dom"

export const Links = ({ link = '', message = '', isComponent }) => {
  return (
    <>
      {!isComponent ? (<a href={link} target="_blank" rel="noreferrer">
        {message}
      </a>) : (<Link to={link}> {message} </Link>)}

    </>
  )
}