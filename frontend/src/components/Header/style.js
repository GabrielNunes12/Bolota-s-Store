import styled from 'styled-components';

export const HeaderContainer = styled.div`
  display: flex;
  background-color: #de7a86;
  & a {
    margin: 3rem 1rem; 
    text-decoration: none;
    color: #fff;
    transition: 0.5s;
  }
  & a:hover {
    color: #000;
  }
` 