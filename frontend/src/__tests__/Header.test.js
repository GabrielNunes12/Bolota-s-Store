import { render, screen } from '@testing-library/react';
import App from '../App';

test('renders learn react link', () => {
  render(<App />);
  const altText = screen.getByAltText(/Logo artes da bolota/g);
  expect(altText).toBeInTheDocument();
});