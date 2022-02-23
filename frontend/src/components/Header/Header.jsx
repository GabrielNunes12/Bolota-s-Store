import {HeaderContainer} from './style';
import HeaderImageComponent from '../HeaderImageComponent/HeaderImageComponent';
import imageHeader from '../../images/ImageHeader/imageHeader.png';

const Header = () => {
  return(
    <HeaderContainer>
      <HeaderImageComponent source={imageHeader} alternativeProp="Logo artes da bolota"/>
    </HeaderContainer>
  );
}

export default Header;