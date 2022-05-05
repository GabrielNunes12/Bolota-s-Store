export const Links = ({ link = '', message = '' }) => {
  return (
    <a href={link} target="_blank" rel="noreferrer">
      {message}
    </a>
  )
}